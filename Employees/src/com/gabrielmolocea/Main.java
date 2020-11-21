package com.gabrielmolocea;

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
	    Employee jhon = new Employee("John tim", 30);
	    Employee tim = new Employee("Tim ss", 21);
	    Employee gabriel = new Employee("Gabriel MOlocea" , 25);
	    Employee tom = new Employee("Tom Doe" , 40);
	    Employee snow = new Employee("Snow Jhin", 40);
	    Employee red = new Employee("Red Bull", 35);
	    Employee charming = new Employee("Charming", 35);
    
        List<Employee> employees = new ArrayList<>();
        employees.add(jhon);
        employees.add(tim);
        employees.add(gabriel);
        employees.add(tom);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);
    
        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };
        
        String lastName = getLastName.apply(employees.get(1));
//        System.out.println(lastName);
        
        Function<Employee, String > getFirstName = (Employee employee) -> {
          return employee.getName().substring(0, employee.getName().indexOf(' '));
        };
        
        Random random1 = new Random();
        for (Employee employee : employees) {
            if (random1.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }
        
//        printEmployeesByAge(employees,"Employees over 30", employee -> employee.getAge() > 30);
//        printEmployeesByAge(employees,"Employees 30 or younger ", employee -> employee.getAge() <= 30);
//
//        printEmployeesByAge(employees, "\nEmployees younger then 25", employee -> employee.getAge() < 25);
//
//        IntPredicate greaterThen15 = i -> i > 15;
//        IntPredicate lessThen100 = i -> i < 100;
//
//        System.out.println(greaterThen15.test(10));
//        int a = 20;
//        System.out.println(greaterThen15.test(a+5));
//
//        System.out.println(greaterThen15.and(lessThen100).test(50));
//
//        System.out.println(greaterThen15.and(lessThen100).test(15));
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//
//        System.out.println("***********************");
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(randomSupplier.get());
//        }
//
//        System.out.println("************************");
//
//        employees.forEach(employee -> {
//            String lastName = employee.getName().substring(employee.getName().indexOf(" ") + 1);
//            System.out.println("Last Name is: " + lastName);
//        });
        
        
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
    
    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
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
