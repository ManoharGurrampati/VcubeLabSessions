package com.multi_threading;

public class MyThread1 extends Thread {
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.err.println("InterruptedException Occurs");
		}
		System.out.println("Run Method from MyThread1 class");
		System.out.println("Name of the Thread : " + Thread.currentThread().getName());
		System.out.println("Thread Id: (MyThread1) "+Thread.currentThread().threadId());
		System.out.println("Priority of the Thread : " + Thread.currentThread().getPriority());
	}
}
