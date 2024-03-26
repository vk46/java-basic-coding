package com.vk.numbers;

import java.util.Scanner;

public class PrintSumNumber {
    public static void printReverseNum(int number) {
        if (String.valueOf(number).length() < 2) {
            System.err.println("Please send correct input number!");
            return;
        }
        int result = 0, digit;
        while (number != 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                result += digit;
            }
            number = number / 10;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printReverseNum(num);
        sc.close();
    }
}
