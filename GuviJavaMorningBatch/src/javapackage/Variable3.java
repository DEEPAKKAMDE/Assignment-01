package javapackage;

public class Variable3 {

	int a = 10; // Global Variable
	static int b = 20; // Static Variable

	public static void main(String[] args) {

		int c = 300; // Local Variable

		Variable3 obj = new Variable3();

		System.out.println(c);
		System.out.println(obj.a);
		System.out.println(b);

	}

}
