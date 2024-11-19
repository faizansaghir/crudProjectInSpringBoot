package io.github.faizansaghir.crudProjectInSpringBoot.dao;

import io.github.faizansaghir.crudProjectInSpringBoot.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> allEmployeeQuery = entityManager.createQuery("FROM Employee", Employee.class);
        return allEmployeeQuery.getResultList();
    }
}
