package com.vk.numbers;

import java.util.HashMap;
import java.util.HashSet;

public class PrintMatchNumbers {

    public static void findMatchNumbers(int[] array, int targetNumber) {
        HashSet<Integer> sortIntegers = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            int requiredNumber = targetNumber - array[i];
            if (sortIntegers.contains(requiredNumber)) {
                System.out.print(requiredNumber + " ");
                System.out.print(array[i]);
                return;
            } else {
                sortIntegers.add(array[i]);
            }
        }
        System.out.println("No matching numbers found!");
    }

    public static void findMatchNumbersHashMap(int[] array, int targetNumber) {
        HashMap<Integer, Integer> sortedMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int requiredNumber = targetNumber - array[i];
            if (sortedMap.containsKey(requiredNumber)) {
                System.out.print(requiredNumber);
                System.out.print(" " + array[i]);
                return;
            } else {
                sortedMap.put(array[i], i);
            }
        }
        System.out.println("No matching numbers found!");
    }

    public static void main(String[] args) {
        // PrintMatchNumbers.findMatchNumbers(new int[] { 1, 6, 3, 5, 2 }, 5);
        PrintMatchNumbers.findMatchNumbersHashMap(new int[] { 1, 6, 3, 5, 2 }, 5);
    }
}
