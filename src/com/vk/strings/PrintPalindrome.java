package com.vk.strings;

public class PrintPalindrome {

	public static void printPalindrome(String str) {
		if(str.length()==0) {
			System.out.println("Input string is empty!");
			return;
		}
		StringBuffer reversed = new StringBuffer(str).reverse();
		if(str.equals(reversed.toString())) {
			System.out.println(str+", this string is Palindrome");
		}else {
			System.out.println(str+", this string is not Palindrome");
		}
	}

	public static void palindromeWithoutPredefinedMethod(String str) {
		if(str.length()==0) {
			System.out.println("Input string is empty!");
			return;
		}
		String reversedStr = "";
		for(int i =str.length()-1;i>=0;i--) {
			reversedStr += str.charAt(i);
		}
		if(str.equals(reversedStr.toString())) {
			System.out.println(str+", this string is Palindrome");
		}else {
			System.out.println(str+", this string is not Palindrome");
		}
	}

	public static void main(String[] args) {
		//		printPalindrome("MADAM");
		//		printPalindrome("HELLO");
		//		printPalindrome("");
		//		palindromeWithoutPredefinedMethod("");
		//		palindromeWithoutPredefinedMethod("MADAM");
		palindromeWithoutPredefinedMethod("HELLO");
	}

}
