package com.vk.basic;

public class TrianglePattern {

    public static void shapePattern(int number){
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number-i; j++){
                System.out.print("");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void shapePatternReversed(int number){
        for(int i=1; i<=number; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("");
            }
            for(int j=1; j<=number-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        shapePattern(5);
        shapePatternReversed(5);
    }
}
