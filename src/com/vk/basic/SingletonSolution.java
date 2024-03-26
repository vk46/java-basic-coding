package com.vk.basic;

class Singleton {
    public static volatile Singleton instance;

    public String str;

    private Singleton() {
    }

    public static synchronized Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class SingletonSolution {

    public static void main(String[] args) {
        Singleton singleInstance1 = Singleton.getSingleInstance();
        Singleton singleInstance2 = Singleton.getSingleInstance();
        System.out.println(singleInstance1 == singleInstance2);
    }

}
