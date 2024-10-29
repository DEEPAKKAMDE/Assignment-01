package javaassignment01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any float value");
		float a = sc.nextFloat();
		System.out.println(a);

		System.out.println("Enter any String");
		String str = sc.next();
		System.out.println(str);

	}

}
