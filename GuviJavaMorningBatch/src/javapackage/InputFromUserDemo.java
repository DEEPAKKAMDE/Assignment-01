package javapackage;

import java.util.Scanner;

public class InputFromUserDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println("Enter the String");
		String str = sc.next();

		System.out.println("Entered Number is = " + num);
		System.out.println("Entered String is = " + str);

	}

}
