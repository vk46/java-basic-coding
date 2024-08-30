package com.vk.strings;

import java.util.*;

public class MissingCharacters {

    public static String findMissingCharacters(String input) {

        // Initialize a constant String to store all characters in the alphabet
        String constant = "The quick brown fox jumps over the lazy dog".replaceAll(" ", "");

        Set<Character> alphabetSet = new HashSet<>();
        alphabetSet.addAll(Arrays.asList(constant.toLowerCase().chars().mapToObj(c -> (char)c).toArray(Character[]::new)));

        System.out.println(alphabetSet.toString().toUpperCase());

        // Convert input string to lowercase
        // Remove each character found in the input string from the alphabet set
        for (char c : input.toLowerCase().toCharArray()) {
            alphabetSet.remove(c);
        }

        // Convert the set of missing characters to a string
        StringBuilder missingChars = new StringBuilder();
        for (char c : alphabetSet) {
            missingChars.append(c);
        }

        return missingChars.toString();
    }

    public static void main(String[] args) {
        String sentence = "The lazy dog";
        String missingChars = findMissingCharacters(sentence);
        if (missingChars.isEmpty()) {
            System.out.println("The sentence contains every single letter in the alphabet.");
        } else {
            System.out.println("Missing characters: " + missingChars.toUpperCase());
        }
    }
}

