package com.gabrielmolocea;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n", 3);
        }).start();
	    
	    Employee jhon = new Employee("Jhon", 30);
	    Employee tim = new Employee("Tim", 55);
	    Employee gabriel = new Employee("Gabriel", 25);
	    Employee snow = new Employee("Snow", 22);
    
        List<Employee> employees = new ArrayList<>();
        employees.add(jhon);
        employees.add(tim);
        employees.add(gabriel);
        employees.add(snow);
        
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });
        
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}