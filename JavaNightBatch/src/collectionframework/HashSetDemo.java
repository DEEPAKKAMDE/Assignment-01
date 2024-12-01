package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet myset = new HashSet();

		// Adding Elements

		myset.add(100);
		myset.add("Java");
		myset.add('A');
		myset.add(99.99);
		myset.add(null);
		myset.add(null);
		myset.add(100);

		// Printing HashSet
		System.out.println(myset);

		// Size of Hashset

		System.out.println("Size of Hash Set " + myset.size());

		// Remove Element from Hashset
		myset.remove(100); // Here, 100 is a value not an index.

		System.out.println("After Removing " + myset);

		// Note:- Insertion of Element is not possible in HashSet
		// Accessing of Specific Element is also not possible in HashSet

		// Convert HashSet to ArrayList ( WorkAround Available )

		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(1));

		// Read All the Elements using for each loop

		for (Object x : myset) {

			System.out.println(x);
		}

		myset.clear();
		System.out.println("Is My Set Empty " + myset.isEmpty());

	}

}
