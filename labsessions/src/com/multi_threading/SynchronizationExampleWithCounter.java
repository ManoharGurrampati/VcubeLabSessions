package com.multi_threading;

public class SynchronizationExampleWithCounter {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();

		Runnable thread = () -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		};

		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);

		t1.start();

		t2.start();

//		join() makes caller thread to wait (i.e, main Thread for t1 to complete its execution).
		t1.join();

//		join() makes caller thread to wait (i.e, main Thread for t2 to complete its execution if it isn't complete).
		t2.join();

//		If we didn't use join() then main thread directly executes the last line i.e, print statement. prints premature value.
		System.out.println("Final Value is : " + c.count);
	}
}
