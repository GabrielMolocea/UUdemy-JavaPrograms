package com.gabrielmolocea;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Employee jhon = new Employee("John", 24);
	    Employee tim = new Employee("Tim", 25);
	    Employee gabriel = new Employee("Gabriel", 25);
	    Employee tom = new Employee("Tom", 25);
    
        List<Employee> employees = new ArrayList<>();
        employees.add(jhon);
        employees.add(tim);
        employees.add(gabriel);
        employees.add(tom);
        
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
    }
}
