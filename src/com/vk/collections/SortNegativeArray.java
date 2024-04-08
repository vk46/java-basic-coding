package com.vk.collections;

import java.util.*;

public class SortNegativeArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,-1,5,-6,4,-4);
        list.stream().sorted().findFirst().ifPresent(System.out::println);
        list.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
