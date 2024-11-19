package io.github.faizansaghir.crudProjectInSpringBoot.service;

import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
