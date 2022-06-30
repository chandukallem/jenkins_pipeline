package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll(){
        List<Employee> employees=
                Arrays.asList(new Employee("a","klm"),
                        new Employee("b","pqr"),
                        new Employee("c","xyz"));
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
