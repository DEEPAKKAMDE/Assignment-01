package javaassignment01;

import java.util.Scanner;

public class AdditionDemo {

	// Here, AdditionDemo is User defined class.
	// Here, Scanner is Pre-defined class.

	public static void main(String[] args) {

		// Here, Scanner is a class and sc is an object , new is keyword
		Scanner sc = new Scanner(System.in);
		AdditionDemo obj = new AdditionDemo();
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Addition of 2 numbers = " + sum);

	}

}
