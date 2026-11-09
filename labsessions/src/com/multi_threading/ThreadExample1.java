package com.multi_threading;

public class ThreadExample1 {

	public static void main(String[] args) throws InterruptedException {
//		User-defined Thread
		MyThread1 t1 = new MyThread1(); 
//		start() asks the JVM to create a new call stack, 
//		register the thread with the scheduler, 
//		and then the JVM calls run() on that new stack.
		t1.run();

		Thread.sleep(3000);
		System.out.println("=====> Main method from threadExample1  <=====");
		System.out.println("Name of the Thread (ThreadExample1): " + Thread.currentThread().getName());
		System.out.println("Thread Id: (ThreadExample1) " + Thread.currentThread().threadId());
		System.out.println("Priority of the Thread (ThreadExample1) : " + Thread.currentThread().getPriority());
		System.out.println("==============================================");
	}

}
