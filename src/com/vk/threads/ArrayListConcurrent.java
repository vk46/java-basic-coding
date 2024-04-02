package com.vk.threads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListConcurrent extends Thread {

    static CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            courses.add("Kubernetes");
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
    public static void main(String[] args) {

        ArrayListConcurrent alc = new ArrayListConcurrent();
        alc.start();

        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses.add("Git");

        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            try{
                String course = iterator.next();
                System.out.println(course);
            }catch(Exception e){
                e.fillInStackTrace();
            }
        }
        System.out.println(courses);
    }
    
}
