package com.vk;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Practice {
    public static void findDuplicates(int[] array) {
        if (array.length == 0) {
            System.out.println("Invalid input");
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        IntStream.of(array).parallel().forEach(num -> {
            if (!set.add(num)) {
                duplicateSet.add(num);
            }
        });
        System.out.println("Unique elements: ");
        set.forEach(System.out::println);
        System.out.println("Duplicates elements: ");
        duplicateSet.forEach(System.out::println);
    }

    public static void main(String[] args) {
        findDuplicates(new int[] { 1, 2, 3, 2, 4, 5, 7, 6, 7, 5 });
    }
}
