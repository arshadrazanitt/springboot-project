package com.example.demo.Controller;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController()
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        log.info("Inside controller: /addEmployee");
        Employee emp=employeeService.saveEmployeeDetails(employee);
        return ResponseEntity.ok(emp);
    }

    @GetMapping("/getAllEmployeeInfo")
    public List<Employee> getAllEmployee(){
        log.info("Inside controller: /getAllEmployee");
        return employeeService.getAllEmployeeDetails();
    }
}
