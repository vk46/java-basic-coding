package com.vk.numbers;

import java.util.HashMap;
import java.util.HashSet;

public class PrintDuplicateNumbers {

    public static void findDuplicates(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

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
        set.forEach(System.out::println);
        System.out.println("****");
        duplicateSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        findDuplicatesOpt(new int[] { 1, 2, 3, 5, 2, 7, 3 });
    }
}
