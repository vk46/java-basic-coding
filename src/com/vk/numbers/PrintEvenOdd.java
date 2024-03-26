package com.vk.numbers;

import java.util.Scanner;

public class PrintEvenOdd {

    public static void printEvenOdd(int number) {
        if (number <= 0) {
            System.err.println("Invalid number passed!");
            return;
        }
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        printEvenOdd(num);
        sc.close();
    }

}
