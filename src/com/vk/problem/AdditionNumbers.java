package com.vk.problem;

import com.vk.basic.AddInteger;

public class AdditionNumbers {

    public static void main(String[] args) {
        AddInteger result = Integer::sum;
        System.out.println(result.add(1,2));
    }
}
