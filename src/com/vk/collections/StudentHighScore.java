package com.vk.collections;

import java.util.*;
import java.util.stream.Collectors;

public record StudentHighScore(String name, List<Integer> scores) {

    public static void getStudentWithMaxScore(List<StudentHighScore> students) {
        // Create a map of student names to their total scores.
        Map<String, Integer> studentScores = students.stream()
                .collect(Collectors.toMap(StudentHighScore::name, student -> student.scores().stream().mapToInt(Integer::intValue).sum()));

        studentScores.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .ifPresent(stringIntegerEntry -> System.out.println("The student with the maximum score is: " + stringIntegerEntry.getKey()+","+stringIntegerEntry.getValue()));
    }

    public static void main(String[] args) {
        List<StudentHighScore> students = new ArrayList<>();
        students.add(new StudentHighScore("Alice", Arrays.asList(100, 90, 80)));
        students.add(new StudentHighScore("Bob", Arrays.asList(90, 95, 85)));
        students.add(new StudentHighScore("Carol", Arrays.asList(80, 85, 90)));

        getStudentWithMaxScore(students);
    }
}