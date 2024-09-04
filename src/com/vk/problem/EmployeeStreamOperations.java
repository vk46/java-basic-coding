package com.vk.problem;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Override toString() for easy printing of Employee details
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + '}';
    }
}

public class EmployeeStreamOperations {

    public static Map<String, Employee> getHighestPaidEmployeeByDepartment(List<Employee> employees, double salaryThreshold) {
        return employees.stream()
                .filter(emp -> emp.getSalary() >= salaryThreshold)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get)
                ));
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000),
                new Employee(3, "Charlie", "Finance", 70000),
                new Employee(4, "David", "IT", 80000),
                new Employee(5, "Eve", "HR", 45000),
                new Employee(6, "Frank", "Finance", 55000),
                new Employee(7, "Grace", "IT", 75000)
        );

        double salaryThreshold = 50000;

        Map<String, Employee> highestPaidEmployeeByDepartment = getHighestPaidEmployeeByDepartment(employees, salaryThreshold);

        // Print the results
        highestPaidEmployeeByDepartment.forEach((department, employee) ->
                System.out.println("Department: " + department + ", Highest Paid Employee: " + employee)
        );
    }

}
