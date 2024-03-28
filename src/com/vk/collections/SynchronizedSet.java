package com.vk.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        Set<String> synchronizedSet = Collections.synchronizedSet(set);

        synchronizedSet.add("d");

        System.out.println(synchronizedSet);
    }
}