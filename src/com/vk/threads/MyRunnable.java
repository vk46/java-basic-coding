package com.vk.threads;

public class MyRunnable implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Runnable started!");
    }

    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
    }
    
}
