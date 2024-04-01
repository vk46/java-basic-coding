package com.vk.numbers;

import java.util.Scanner;

public class PrintFibonacci {

	public static void printFibonacci(int number) {
		if (number<0) {
			System.out.println("Please provide correct number");
		}
		
		int n1 = 0;
		int n2 = 1;
		System.out.print("Fibonacci series: "+n1+" "+n2);
		for(int i=2; i<number; i++) {
			int n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printFibonacci(num);
		sc.close();
	}

}
