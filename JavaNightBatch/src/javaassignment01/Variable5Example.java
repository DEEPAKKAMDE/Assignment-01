package javaassignment01;

public class Variable5Example {

	public static void main(String[] args) {

		Variable5Example obj = new Variable5Example();
		int num = 10; // Local Variable
		System.out.println(num); // Calling Local Variable num (10 )
		obj.test(); // Calling test() method

	}

	// User Defined method
	public void test() {

		int a = 20; // Local Variable
		System.out.println(a);

	}

}
