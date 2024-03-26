package com.vk.numbers;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void printPrime(int input){
		if(input<=0||input==1){
			System.out.println("Not prime number");  
			return;
		}
		for (int i = 2; i <= input; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
			int num = sc.nextInt();
			PrintPrimeNumbers.printPrime(num);
			System.out.println();
		}
		sc.close();
	}
}
