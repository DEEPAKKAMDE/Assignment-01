package javapackage;

public class ForEachDemo {

	public static void main(String[] args) {

		// Define an integer array
		int a[] = { 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		String str[] = { "Sanket", "Simon", "Peter", "Sumit", "Mansi" };
		
		// Print an Array using for each loop
		for (int b : a) {
			System.out.println(b);
		}

		for (String str1 : str) {
			System.out.println(str1);
		}

	}

}
