package collectionframework;

import java.util.ArrayDeque;

public class ArrayDeque01 {

	public static void main(String[] args) {

		// It Follows FIFO Principal ( First In First Out )
		ArrayDeque<String> name = new ArrayDeque<>();
		name.add("Sanket");
		name.add("Sumit");
		name.add("Mansi");

		System.out.println(name);
		name.remove();
		System.out.println(name);

	}

}
