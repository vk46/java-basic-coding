package com.vk.basic;

public class NumberPattern {

    public static void numberPattern(int number){
         for (int i = 1; i <= number; i++) {
             for (int j = 1; j <= number - i; j++) {
                 System.out.print("");
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print(j);
             }
             System.out.println();
         }
    }

    public static void numberPatternReverse(int number){
        for(int i=1; i<=number; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("");
            }
            for(int j=1; j<=number-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberPattern(5);
        numberPatternReverse(5);
    }
}
