package com.cc.jpa.example.service;

import com.cc.jpa.example.repository.EmployeeRepository;
import com.cc.jpa.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee listEmployees() {
        return employeeRepository.findById();
    }
}
