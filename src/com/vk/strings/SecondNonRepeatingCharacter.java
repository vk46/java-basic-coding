package com.vk.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondNonRepeatingCharacter {

    private static Character findNonRepeatChar(String input) {
        LinkedHashMap<Character, Long> mapFilter = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())); // Create a LinkedHashMap with char count

        Character result = mapFilter.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1) // Filter characters that occur only once
                .skip(1) // Skip the first non-repeating character
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        return result;
    }

    public static void main(String[] args) {
        String input = "vinay";
        Character cResult = findNonRepeatChar(input);
        System.out.println("Second Non-repeating Character -> "+cResult);
    }
}
