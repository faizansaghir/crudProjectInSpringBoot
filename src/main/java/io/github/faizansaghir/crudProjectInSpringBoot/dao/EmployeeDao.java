package io.github.faizansaghir.crudProjectInSpringBoot.dao;

import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
