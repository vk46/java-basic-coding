package com.vk.strings;

public class PrintAnagram {

	static boolean isAnagram() {
        int[] count = new int[256];
		for(int i = 0; i< "anagram".length(); i++) {
			count["anagram".toLowerCase().charAt(i)]++;
			count["margana".toLowerCase().charAt(i)]--;
		}
        for (int j : count) {
            if (j != 0) {
                return false;
            }
        }
		return true;
	}

	public static void main(String[] args) {
		boolean result = isAnagram();
		System.out.println((result) ? "Anagrams" : "Not Anagrams" );
	}

}
