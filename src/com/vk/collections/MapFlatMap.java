package com.vk.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.vk.model.Employee;

public class MapFlatMap {
    
    public static void main(String[] args) {

        List<String> cities1 = Arrays.asList("Bangalore","Pune","Chennai");
        List<String> cities2 = Arrays.asList("Mumbai","Noida","Indore","Pune");
        List<String> cities3 = Arrays.asList("Bangalore","Pune","Chennai","Hyderabad");

        Employee e1 = new Employee(1, "Vinay", cities1);
        Employee e2 = new Employee(1, "Kumar", cities2);
        Employee e3 = new Employee(1, "Vinay Kumar", cities3);

        List<Employee> empList = new ArrayList<>(Arrays.asList(e1,e2,e3));

        // System.out.println(empList);

        List<String> names = empList.stream().map(emp-> emp.getName()).collect(Collectors.toList());
        System.out.println(names);

        List<List<String>> cityList = empList.stream().map(emp-> emp.getCities()).collect(Collectors.toList());
        System.out.println(cityList);

        List<String> cities = empList.stream().flatMap(emp-> emp.getCities().stream()).collect(Collectors.toList());
        TreeSet<String> orderedCity = new TreeSet<>(cities);
        System.out.println(orderedCity);
    }
}
