package com.vk.collections;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		String[] names = {"John", "Doe", "Jane"};

		// Sort the names using the instance method String.compareToIgnoreCase()
		Arrays.sort(names, String::compareToIgnoreCase);
		
		List<String> nameList = Arrays.asList(names);

		// Print the sorted names
		nameList.forEach(System.out::println);

	}

}
