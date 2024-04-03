package com.vk.strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterDuplicate {

    public static void printRepetition(String input){
        char[] chars = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: chars){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        map.forEach((key, value) -> System.out.println(key+" : "+value));
    }
    public static void main(String[] args) {
        printRepetition("AAABBCCDDD");
    }
}
