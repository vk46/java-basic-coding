package com.vk.strings;

public class PrintAnagram {

	static boolean isAnagram(String a, String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		int count[] = new int[256];
		for(int i=0;i<a.length();i++) {
			count[a.toLowerCase().charAt(i)]++;
			count[b.toLowerCase().charAt(i)]--;
		}
		for(int i = 0; i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		boolean result = isAnagram("ANAGRAMS", "SMARGANA");
		boolean result = isAnagram("anagramm", "margana");
		System.out.println((result) ? "Anagrams" : "Not Anagrams" );
	}

}
