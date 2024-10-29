package javaassignment01;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Value for A");
		int a = sc.nextInt();
		System.out.println("Enter Value for B");
		int b = sc.nextInt();

		if (a > b) {

			System.out.println("A is Greater");
		} else if (a == b) {
			System.out.println("A is Equal to B");
		} else {
			System.out.println("A is Lesser");
		}

	}

}
