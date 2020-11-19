package com.gabrielmolocea;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
	    Employee jhon = new Employee("John", 30);
	    Employee tim = new Employee("Tim", 21);
	    Employee gabriel = new Employee("Gabriel", 25);
	    Employee tom = new Employee("Tom", 40);
	    Employee snow = new Employee("Snow", 40);
	    Employee red = new Employee("Red", 35);
	    Employee charming = new Employee("Charming", 35);
    
        List<Employee> employees = new ArrayList<>();
        employees.add(jhon);
        employees.add(tim);
        employees.add(gabriel);
        employees.add(tom);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);
    
        printEmployeesByAge(employees,"Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees,"Employees 30 or younger ", employee -> employee.getAge() <= 30);
        
        
//        employees.forEach(employee -> {
//            if (employee.getAge() <= 30) {
//                System.out.println(employee.getName());
//            }
//        });
//        for (Employee employee : employees) {
//            if (employee.getAge() > 30) {
//                System.out.println(employee.getName());
//            }
//        }
//
//        employees.forEach(employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });
    }
    
    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("---------------------");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
//        employees.forEach(employee -> {
//            if (employee.getAge() > 30) {
//                System.out.println(employee.getName());
//            }
//        });
    }
}
