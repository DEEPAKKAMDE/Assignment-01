package javaassignment01;

public class StaticDemo {

	public static void main(String[] args) {

		test();
		demo();

	}

	public static void test() {

		System.out.println("This is User Defined Method");
	}

	public static void demo() {
		System.out.println("This is Static demo method");
	}

	// Note:- if we are creating static user defined method
	// then No need to create an Object of a class
	// We can call directly that static method.

}
