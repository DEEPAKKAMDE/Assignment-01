package oopsconcept;

public class EqualsDemo {

	String str1 = "java";
	String str2 = "JAVA";

	public static void main(String[] args) {

	//	EqualsDemo obj = new EqualsDemo();
		//obj.stringcompare();
		///obj.stringcomparewithoutcasesensitive();

	}

	public void stringcompare() {

		if (str1.equals(str2)) {

			System.out.println("Both Strings are Equal ");
		} else {

			System.out.println("Both Strings are not Equal");
		}
	}

	public void stringcomparewithoutcasesensitive() {

		if (str1.equalsIgnoreCase(str2)) {

			System.out.println("Both Strings are Equal ");
		} else {

			System.out.println("Both Strings are not Equal");
		}
	}

}
