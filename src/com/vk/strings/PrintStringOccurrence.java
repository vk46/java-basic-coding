package com.vk.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintStringOccurrence {

    public static void characterOccurrence(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charList = input.trim().toCharArray();
        for (char c : charList) {
            if (charCountMap.containsKey(c))
                charCountMap.put(c, charCountMap.get(c) + 1);
            else if (!Character.isWhitespace(c))
                charCountMap.put(c, 1);
        }

        for (Character c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1)
                System.out.println(c + " : " + charCountMap.get(c));
        }
        System.out.println(input);
    }

    public static void characterStreams(String str) {
        List<Character> list = str.replaceAll("\\s", "").chars().mapToObj(c -> (char) c).toList();
        Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((key, value) -> {
            if (value > 1)
                System.out.println(key + " : " + value);
        });
    }

    public static void main(String[] args) {
        characterOccurrence("Tejaswini Kallu".toUpperCase());
        characterStreams("Vinay Kumar Palla".toUpperCase());
    }
}
