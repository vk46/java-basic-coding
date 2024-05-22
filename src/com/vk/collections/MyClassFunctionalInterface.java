package com.vk.collections;

import com.vk.model.A;
import com.vk.model.B;

public class MyClassFunctionalInterface implements A, B {
    @Override
    public void test() {
        A.super.test();
//        B.super.test();
    }

    @Override
    public void hello(String str) {

    }

    @Override
    public void hello(String str, String name) {

    }

    public static void main(String[] args) {
        MyClassFunctionalInterface foci = new MyClassFunctionalInterface();
        foci.test();
    }
}
