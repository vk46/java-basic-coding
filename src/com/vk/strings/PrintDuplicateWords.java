package com.vk.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateWords {

	public static void printDuplicates(String str) {

		String words[] = str.split(" ");

		Map<String, Integer> wordMap = new HashMap<>();

		for (String string : words) {
			if(wordMap.containsKey(string.toLowerCase())) {
				wordMap.put(string.toLowerCase(), wordMap.get(string)+1);
			}else {
				wordMap.put(string.toLowerCase(),1);
			}
		}

		for(Map.Entry<String, Integer> entry: wordMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
//		printDuplicates("This is string with having duplicate words and this is having unique words");
		printDuplicates("Bug black bug bit a big black dog on his big black nose");
	}

}
