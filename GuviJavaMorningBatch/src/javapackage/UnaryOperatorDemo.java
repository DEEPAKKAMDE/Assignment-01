package javapackage;

public class UnaryOperatorDemo {

	public static void main(String[] args) {

		int a=99;
		
		int b=100;
		
		System.out.println(++a + b++);// 200,101
		System.out.println(b);
		
		// a=100 b=101
		System.out.println(-- a + b--); //99+ 101 =200

	}

}
