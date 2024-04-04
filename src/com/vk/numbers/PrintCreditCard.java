package com.vk.numbers;

import java.util.Scanner;

public class PrintCreditCard {

    public static void issueCreditCard(int score) {
        if (score < 400 || score > 850) {
            System.err.println("Invalid credit score!");
            return;
        }
        if (score < 600) {
            System.out.println("Silver card");
        } else if (score < 800) {
            System.out.println("Gold card");
        } else {
            System.out.println("Platinum card");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        PrintCreditCard.issueCreditCard(num);
        sc.close();
    }

}
