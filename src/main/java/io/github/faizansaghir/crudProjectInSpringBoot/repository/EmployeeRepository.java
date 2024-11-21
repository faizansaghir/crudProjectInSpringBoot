package io.github.faizansaghir.crudProjectInSpringBoot.repository;

import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
