package com.vk.basic;

import java.util.Arrays;

public class PasswordStore {
    public static void main(String[] args) {
        String pwd = "Vinay46";
        System.out.println(pwd);

        char[] c = new char[]{'V','i','n','a','y','4','6'};
        System.out.println(Arrays.toString(c));
        Arrays.fill(c, '*');
        System.out.println(c);
    }
}
