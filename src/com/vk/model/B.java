package com.vk.model;

@FunctionalInterface
public interface B {

    default void test(){
        System.out.println("Functional interface B method");
    }

    void hello(String str);
}
