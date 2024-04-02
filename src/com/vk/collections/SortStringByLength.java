package com.vk.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringByLength {

    public static List<String> sortStrings(List<String> listOfStrings){
        List<String> result;
        // result.sort(Comparator.comparingInt(String::length));
        result = listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("C","Java","Python","C#","HTML","C++", "COBOL","Ruby","Scala");
        System.out.println(sortStrings(list));
    }
    
}
