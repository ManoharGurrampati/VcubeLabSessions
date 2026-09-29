package com.fundamentals;

public class GCExamples {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Is Nullified.!");
	}

// when the control returns to main() then the obj which is poointed by obj1 is unreachable from main().
	void demo() {
//		obj1 -> object A
		GCExamples obj1 = new GCExamples();
	}

	public static void main(String[] args) {
		
//		obj2 -> object B
		GCExamples obj2 = new GCExamples();
		obj2.demo();
		
//		obj3 -> object C
		GCExamples obj3 = new GCExamples();

//		object B is unreachble from gc roots, because obj2 is pointing to object C.
		obj2 = obj3;

//		object C is still alive, coz obj2 is pointing to Object C, even though Obj3 is null.
		obj3 = null;

//		obj4 -> object D
		GCExamples obj4 = new GCExamples();

//		object C is still alive, coz obj2 is pointing to Object C, even though Obj3 is null.
		obj3 = obj4;

		System.gc();
	}

}
