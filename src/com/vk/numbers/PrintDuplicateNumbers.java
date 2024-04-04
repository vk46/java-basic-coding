package com.vk.numbers;

import java.util.HashMap;
import java.util.HashSet;

public class PrintDuplicateNumbers {

    public static void findDuplicates(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : array) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        
        System.out.println("Unique elements : ");
        map.forEach((key, value) -> {
            if (value == 1) {
                System.out.println(key);
            }
        });
        System.out.println("Duplicate elements : ");
        map.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key);
            }
        });

    }

    public static void findDuplicatesOpt(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int num : array) {
            if (!set.add(num)) {
                duplicateSet.add(num);
            }
        }
        System.out.println("Unique set : ");
        set.forEach(System.out::println);
        System.out.println("Duplicate set : ");
        duplicateSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        findDuplicates(new int[] { 11, 22, 33, 55, 22, 77, 33 });
        findDuplicatesOpt(new int[] { 1, 2, 3, 5, 2, 7, 3 });
    }
}
