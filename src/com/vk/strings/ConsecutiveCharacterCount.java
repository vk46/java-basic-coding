package com.vk.strings;

public class ConsecutiveCharacterCount {

    private static String countCharacters(String input) {
        if(input==null || input.isEmpty()){
            throw new RuntimeException("Input is invalid");
        }

        StringBuilder result = new StringBuilder();
        int count=1;
        char currentChar = input.charAt(0);

        for(int i=1; i<input.length(); i++){
            if(input.charAt(i) == currentChar){
                count++;
            }else {
                result.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count=1;
            }
        }

        // Append the last character and its count
        result.append(currentChar).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        String input  ="aabbbcca";
        //a2b3c2a1
        String result = countCharacters(input);
        System.out.println(result);
    }
}
