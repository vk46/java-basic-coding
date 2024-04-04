package com.vk.strings;

public class PrintPalindrome {

	public static void printPalindrome(String str) {
		if(str.isEmpty()) {
			System.out.println("Input string is empty!");
			return;
		}
		StringBuffer reversed = new StringBuffer(str).reverse();
		if(str.contentEquals(reversed)) {
			System.out.println(str+", this string is Palindrome");
		}else {
			System.out.println(str+", this string is not Palindrome");
		}
	}

	public static void palindromeWithoutPredefinedMethod(String str) {
		if(str.isEmpty()) {
			System.out.println("Input string is empty!");
			return;
		}
		StringBuilder reversedStr = new StringBuilder();
		for(int i =str.length()-1;i>=0;i--) {
			reversedStr.append(str.charAt(i));
		}
		if(str.contentEquals(reversedStr)) {
			System.out.println(str+", this string is Palindrome");
		}else {
			System.out.println(str+", this string is not Palindrome");
		}
	}

	public static void main(String[] args) {
		printPalindrome("MADAM");
		palindromeWithoutPredefinedMethod("HELLO");
	}

}
