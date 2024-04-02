package com.vk.collections;

import com.vk.model.Employer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFunction {
    public static void main(String[] args) {
        Employer e1 = new Employer(1, "Vinay", "Hyderabad", "India", 20000);
        Employer e2 = new Employer(2, "Ajay", "Hyderabad", "India", 10000);
        Employer e3 = new Employer(3, "Ravi", "Bangalore", "India", 30000);
        Employer e4 = new Employer(4, "Niki", "San Jose", "US", 40000);
        Employer e5 = new Employer(5, "Vrindha", "Bangalore", "India", 50000);

        List<Employer> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
        HashMap<Employer, String> map = new HashMap<>();

        Map<String, List<Employer>> groupedEmployees = employeeList.stream()
                .filter(employer -> employer.getCountry().equals("India"))
                .collect(Collectors.groupingBy(Employer::getCity));

        groupedEmployees.forEach((city, empList) -> {
            System.out.println("Employees in " + city + ": ");
            empList.forEach(emp -> System.out.println(emp.getName()));
        });
    }
}
