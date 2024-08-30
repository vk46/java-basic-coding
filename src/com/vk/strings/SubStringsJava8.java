package com.vk.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SubStringsJava8 {

    public static void main(String[] args) {
        String input = "vinay_kumar";
        String output = Arrays.stream(input.split("_"))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining());
        System.out.println(output);

        String input1 = "vinayKumar";

        String output1 = input1.chars()
                .mapToObj(c -> Character.isUpperCase(c) ? "_" + Character.toLowerCase((char) c) : String.valueOf((char) c))
                .collect(Collectors.joining());

        if (output1.startsWith("_")) {
            output1 = output1.substring(1); // Remove leading underscore if present
        }

        System.out.println(output1);
    }
}
