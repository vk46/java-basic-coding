package com.vk.strings;

public class PrintContainsWord {

	public static void printWordContains(String str, String word) {
		if(str.toLowerCase().contains(word.toLowerCase())) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}

	public static void main(String[] args) {
		printWordContains("This is word in string","Word");
	}

}
