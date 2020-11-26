package com.gabrielmolocea;

import java.util.*;

/**
 * Created by Gabriel on 26/11/2020
 */

public class Department {
    private String name;
    private List<Employee> employees;
    
    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    
    public List<Employee> getEmployees() {
        return employees;
    }
}
