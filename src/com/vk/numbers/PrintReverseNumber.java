package com.vk.numbers;

import java.util.Scanner;

public class PrintReverseNumber {

    public static void printReverseNumber(int number) {
        if (String.valueOf(number).length() < 2) {
            System.err.println("Please enter valid input!");
            return;
        }
        String input = String.valueOf(number);
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        System.out.println(result);
    }

    public static void printReverseNum(int number) {
        if (number < 10) {
            System.err.println("Please enter valid input!");
            return;
        }
        int digit, result=0;
        while (number != 0) {
            digit = number % 10;
            System.out.print(digit + "");
            result = result*10+digit;
            number = number / 10;
        }
        // System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        printReverseNumber(num);
        sc.close();
    }

}
