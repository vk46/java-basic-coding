package com.vk.threads;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread started!");
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	}

}
