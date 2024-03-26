package com.vk.model;

import java.util.List;

public class Employee {
    
    public Integer id;
    public String name;
    public List<String> cities;
    
    public Employee(Integer id, String name, List<String> cities) {
        this.id = id;
        this.name = name;
        this.cities = cities;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<String> getCities() {
        return cities;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", cities=" + cities + "]";
    }

}
