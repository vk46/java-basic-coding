package com.vk.numbers;

import java.util.Scanner;

public class PrintReverseNumber {

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
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        printReverseNum(num);
        sc.close();
    }

}
