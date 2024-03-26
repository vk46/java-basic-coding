package com.vk.strings;

public class PrintSring {

	public static void main(String[] args) {
		String str = new String("Vinay"); 
		System.out.println(str.hashCode());
		String str2 = new String("Vinay");
		str2 = "VinayK";
		System.out.println(str2.hashCode());
	}

}
