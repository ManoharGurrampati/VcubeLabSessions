package com.multi_threading;

public class Counter {
	int count = 0;

//	without synchronized keyword -> (Thread 1)t1 and (Thread 2)t2 can collide:
//	Suppose count is currently 50.
//	t1 reads 50, and at the exact same moment, t2 also reads 50.
// 	t1 adds 1 and writes 51.
//	t2 (which still thinks the value was 50) adds 1 and writes 51.
//	Two increments happened, but count only went from 50 to 51—one update was lost.

	void increment() {
		count++;
//		System.out.println("Value : " + count);
	}

//	Makes available for one thread at a time, reduces concurrency.
//	synchronized void increment() {
//		count++;
//	}

}
