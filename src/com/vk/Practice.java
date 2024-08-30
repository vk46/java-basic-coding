package com.vk;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Practice {
    public static void findDuplicates(int[] array) {
        if (array.length == 0) {
            System.out.println("Invalid input");
        }

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();

        IntStream.of(array).forEach(num -> {
            if (!set.add(num)) {
                duplicateSet.add(num);
            }
        });
        System.out.print("Unique elements: ");
        set.forEach(System.out::print);
        System.out.println();
        System.out.print("Duplicates elements: ");
        duplicateSet.forEach(System.out::print);
    }

    public static void main(String[] args) {
        findDuplicates(new int[] { 1, 2, 3, 2, 4, 5, 7, 6, 7, 5 });
    }
}
