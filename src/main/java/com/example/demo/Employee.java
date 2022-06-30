package com.example.demo;

public class Employee {
    private String empName;
    private String empAddress;

    public Employee(String empName, String empAddress) {
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }
}
