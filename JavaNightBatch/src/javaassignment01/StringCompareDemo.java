package javaassignment01;

public class StringCompareDemo {

	public static void main(String[] args) {

		String str1="java";
		String str2="JAVA";

		// Case Sensitive

		if(str1.equalsIgnoreCase(str2)) {

			System.out.println("Strings are Equal");
		}
		else {
			System.out.println("Strings are not Equal");
		}
	}

}
