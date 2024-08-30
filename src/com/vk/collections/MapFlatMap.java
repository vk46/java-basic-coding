package com.vk.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.vk.model.Employee;

public class MapFlatMap {
    
    public static void main(String[] args) {

        String input = "VinayKumar palla";
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    // Recursive method to reverse a string
    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character
        if (str.isEmpty()) {
            return str;
        }
        str = str.replaceAll("\\s", "");

        // Recursive case: reverse the rest of the string and add the first character to the end
        return reverse(str.toLowerCase().substring(1))+str.toLowerCase().charAt(0);
    }

}
