package com.vk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemStatement {

    public static void printCharsContains(List<String> list){
        List<String> newList = list.stream().filter(str -> str.toLowerCase().contains("ap")).collect(Collectors.toList());
        System.out.println(newList);
    }
    public static void main(String[] args) {
        printCharsContains(new ArrayList<>(Arrays.asList("Apple", "Banana", "Grapes")));
    }
}
