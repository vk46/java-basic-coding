package com.vk.numbers;

import java.util.Scanner;

public class PrintFibonacciRecursion {

	public static int printFibonacciRecursion(int number) {
		if (number == 0 || number == 1) {
			return number;
		} else {
			return printFibonacciRecursion(number - 1) + printFibonacciRecursion(number - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print(printFibonacciRecursion(i) + " ");
		}
		sc.close();
	}

}
