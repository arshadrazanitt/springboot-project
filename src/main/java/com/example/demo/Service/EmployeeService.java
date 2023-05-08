package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployeeDetails(Employee employee){
        log.info("Inside service class saveEmployeeDetails");
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployeeDetails(){
        log.info("Inside service class getAllEmployeeDetails");
        return (List<Employee>) employeeRepository.findAll();
    }
}
