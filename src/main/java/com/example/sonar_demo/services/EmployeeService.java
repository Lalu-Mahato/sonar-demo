package com.example.sonar_demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sonar_demo.dto.EmployeeReqDto;
import com.example.sonar_demo.entity.Employee;
import com.example.sonar_demo.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee create(EmployeeReqDto request) {
        Employee employee = new Employee();
        employee.setEmail(request.getEmail());
        employee.setName(request.getName());
        return employeeRepository.save(employee);
    }
}
