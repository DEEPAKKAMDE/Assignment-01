package javaassignment01;

public class NestedIfBlock {

	public static void main(String[] args) {

		int a = 100;
		int b = 50;

		// Outer if Block
		if (a > 90) {

			// Inner if Block
			if (b > 100) {

				System.out.println("B is Greater");
			}
			// Inner else block
			else {

				System.out.println("B is Lesser");
			}
		}
// outer else block
		else {

			System.out.println("A is Lesser");
		}

	}

}
