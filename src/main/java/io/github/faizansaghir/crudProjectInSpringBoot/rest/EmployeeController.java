package io.github.faizansaghir.crudProjectInSpringBoot.rest;

import io.github.faizansaghir.crudProjectInSpringBoot.dao.EmployeeDao;
import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeDao.findAll();
    }
}
