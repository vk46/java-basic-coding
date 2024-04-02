package com.vk.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateWords {

	public static void printDuplicates(String str) {

		String[] words = str.toLowerCase().split(" ");

		Map<String, Integer> wordMap = new HashMap<>();

		for (String string : words) {
			if(wordMap.containsKey(string.toLowerCase())) {
				wordMap.put(string.toLowerCase(), wordMap.get(string.toLowerCase())+1);
			}else {
				wordMap.put(string.toLowerCase(),1);
			}
		}

		wordMap.entrySet().stream()
				.filter(entry  -> entry.getValue()>1)
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}

	public static void printDuplicatesOptimize(String input){
		Arrays.stream(input.toLowerCase().split("\\s+"))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}

    public static void main(String[] args) {
		System.out.println("Using Java HashMap : ");
        printDuplicates("Bug black bug bit a big black dog on his big black nose");
		System.out.println("Using Java Stream API : ");
        printDuplicatesOptimize("Bug black bug bit a big black dog on his big black nose");
    }

}
