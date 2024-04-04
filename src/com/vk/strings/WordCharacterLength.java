package com.vk.strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class WordCharacterLength {

    public static void printCharLength(String input){
        if(input.isEmpty()){
            System.out.println("Invalid input");
            return;
        }
        Arrays.stream(input.split(" ")).forEach(word -> System.out.println("Word: "+word+", Character count: "+word.chars().count()));
    }
    public static void main(String[] args) {
//        printCharLength("");
        printCharLength("Vinay K Palla");
    }
}
