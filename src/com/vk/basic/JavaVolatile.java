package com.vk.basic;

class VolatileExample {
    private volatile int counter = 0;

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

public class JavaVolatile {
    public static void main(String[] args) {
        try {
            VolatileExample example = new VolatileExample();

            Thread thread1 = new Thread(example::increment);

            Thread thread2 = new Thread(() -> System.out.println(example.getCounter()));

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }
    }
}
