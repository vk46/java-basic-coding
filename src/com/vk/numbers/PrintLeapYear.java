package com.vk.numbers;

import java.util.Scanner;

public class PrintLeapYear {

    public static void printLeapYear(int year) {
        if (String.valueOf(year).length() < 4) {
            System.err.println("Invalid year passed!");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        printLeapYear(num);
        sc.close();
    }
}
