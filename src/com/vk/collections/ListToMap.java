package com.vk.collections;

import com.vk.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void printListToMap(List<Student> list){
        Map<Integer, String> studentMap = list.stream()
                .collect(Collectors.toMap(Student::id, Student::fname));

        studentMap.forEach((key, value) -> System.out.println(key+"="+value));

    }
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Alice", 90));
        studentList.add(new Student(2,"Bob", 85));
        studentList.add(new Student(3,"Carol", 60));

        printListToMap(studentList);
    }

}
