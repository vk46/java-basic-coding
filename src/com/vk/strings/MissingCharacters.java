package com.vk.strings;

import java.util.*;
import java.util.stream.Collectors;

public class MissingCharacters {

    public static Set<Character> findMissingCharacters(String input) {

        // Initialize a constant String to store all characters in the alphabet
        String constant = "The quick brown fox jumps over the lazy dog";

        Set<Character> alphabetSet = constant.replaceAll(" ", "")
                .toLowerCase().chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.toSet());
        Set<Character> inputSet = input.replaceAll(" ", "")
                .toLowerCase().chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.toSet());

        // Remove each character found in the input string from the alphabet set
        for (Character c : inputSet) {
            alphabetSet.remove(c);
        }

        return alphabetSet;
    }

    public static void main(String[] args) {
        String sentence = "The lazy dog";
        Set<Character> missingChars = findMissingCharacters(sentence);
        if (missingChars.size()==0) {
            System.out.println("The sentence contains every single letter in the alphabet.");
        } else {
            System.out.println("Missing characters: " + missingChars.toString());
        }
    }
}

