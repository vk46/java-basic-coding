package com.vk.collections;

import java.util.ArrayList;
import java.util.List;

public class Java8StreamAPI {
    public static void main(String[] args) {
        List<String>languages = new ArrayList <String>();
        languages.add("English");
        languages.add("German");
        languages.add("French");
        languages.add("Spanish");
        languages.add("Hindi");
        languages.add("Telugu");

        languages.stream().forEach(System.out::println);
        System.out.println("************");
        languages.stream().filter(lang -> lang.startsWith("T")).forEach(System.out::println);
        System.out.println("************");
        languages.stream().map(lan -> lan.toUpperCase()).forEach(System.out::println);
        System.out.println("************");
        languages.stream().sorted().forEach(System.out::println);
        System.out.println("************");
        long count = languages.stream().count();
        System.out.println("Language Count "+count);
        System.out.println("************");
    }
    
}
