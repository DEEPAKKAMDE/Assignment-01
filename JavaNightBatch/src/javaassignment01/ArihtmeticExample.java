package javaassignment01;

public class ArihtmeticExample {

	public static void main(String[] args) {

		// Here, add(), sub() and mult() is a User Defined method
		// Here, main() , println() is a Pre Defined method
		ArihtmeticExample ae = new ArihtmeticExample();

		// Calling the User Defined methods
		// Note:- Always Call User Defined methods inside main() method
		ae.mult();
		ae.add();
		ae.sub();

	}

	// User Defined Method
	// Method Definition
	public void add() {

		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}

	public void sub() {

		int a = 100;
		int b = 20;
		int sub = a - b;
		System.out.println(sub);
	}

	public void mult() {

		int a = 100;
		int b = 20;
		int multi = a * b;
		System.out.println(multi);
	}

}
