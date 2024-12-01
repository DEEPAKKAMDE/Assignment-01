package javapackage;

public class NestedIfDemo {

	public static void main(String[] args) {

		int age = 19;
		int weight = 40;

		// Outer if Block
		if (age > 18) {

			// Inner If block
			if (weight > 45) {
				System.out.println("Eligible for Blood Donation");
			} else {
				System.out.println("Not Eligible for Blood Donation");
			}
		}

		else {

			System.out.println("Age Must be Greater than 18");
		}

	}

}
