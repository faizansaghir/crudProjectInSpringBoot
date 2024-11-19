package io.github.faizansaghir.crudProjectInSpringBoot.service;

import io.github.faizansaghir.crudProjectInSpringBoot.dao.EmployeeDao;
import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
