package io.github.faizansaghir.crudProjectInSpringBoot.service;

import io.github.faizansaghir.crudProjectInSpringBoot.dao.EmployeeDao;
import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;
import io.github.faizansaghir.crudProjectInSpringBoot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDao employeeDao;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao, EmployeeRepository employeeRepository) {
        this.employeeDao = employeeDao;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
//        return employeeDao.findAll();
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
//        return employeeDao.findById(id);
        return employeeRepository.findById(id).orElse(null);
    }

//    @Transactional
    @Override
    public Employee save(Employee employee) {
//        return employeeDao.save(employee);
        return employeeRepository.save(employee);
    }

//    @Transactional
    @Override
    public void deleteById(int id) {
//        employeeDao.deleteById(id);
        employeeRepository.deleteById(id);
    }
}
