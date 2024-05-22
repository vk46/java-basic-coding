package com.vk.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IdentityFunctionExample {

    public static void main(String[] args) {
        String str = "VinayKumarPalla";
        List<Character> names = str.chars().mapToObj(c -> (char) c).toList();

        Map<Character, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((key,value) -> {
            if(value>1)
                System.out.println(key+" : "+value);
        });
    }
}
