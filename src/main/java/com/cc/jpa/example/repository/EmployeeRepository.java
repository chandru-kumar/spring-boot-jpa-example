package com.cc.jpa.example.repository;

import com.cc.jpa.example.model.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class EmployeeRepository {

    @PersistenceContext
    EntityManager entityManager;
    public Employee findById() {
        /*List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Adam", "Software Engineer"));*/
        return entityManager.find(Employee.class, 10001);

    }
}
