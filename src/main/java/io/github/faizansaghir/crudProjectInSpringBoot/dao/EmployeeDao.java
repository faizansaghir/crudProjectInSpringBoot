package io.github.faizansaghir.crudProjectInSpringBoot.dao;

import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
}
