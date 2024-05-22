package com.vk.model;

@FunctionalInterface
public interface A {

    default void test(){
        System.out.println("Functional interface A method ");
    }

    void hello(String str, String name);
}
