package collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		// Note :  Stack Follows LIFO Principal
		Stack<String> name = new Stack();

		name.push("Ankit");
		name.push("Sanket");
		name.push("Sumit");

		System.out.println(name);

		name.pop();
		System.out.println(name);

	}

}
