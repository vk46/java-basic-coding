package com.vk.model;

import java.util.List;
import java.util.Objects;

public class Employer {
    public Integer id;
    public String name;
    public String city;
    public String country;
    public Integer salary;

    public Employer(Integer id, String name, String city, String country, Integer salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer employer)) return false;
        return Objects.equals(getId(), employer.getId()) && Objects.equals(getName(), employer.getName()) && Objects.equals(getCity(), employer.getCity()) && Objects.equals(getCountry(), employer.getCountry()) && Objects.equals(getSalary(), employer.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCity(), getCountry(), getSalary());
    }
}
