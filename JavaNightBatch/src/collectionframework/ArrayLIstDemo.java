package collectionframework;

import java.util.ArrayList;

public class ArrayLIstDemo {

	public static void main(String[] args) {

		ArrayList myList = new ArrayList();

		// Adding Data into ArrayList
		myList.add(100);
		myList.add(10.5);
		myList.add("Simon");
		myList.add('A');
		myList.add(100);
		myList.add(null);
		myList.add(true);
		myList.add(null);

		// Size of ArrayList
		System.out.println(myList.size());

		// Printing ArrayList
		System.out.println("Printing Data from ArrayList" + myList);

		// Remove Elements from ArrayList
		System.out.println(myList.remove(4));

		// After Removing Printing ArrayList
		System.out.println("After Removing" + myList);

		// Insert Element in ArrayList
		myList.add(0, "Martin");

		// After Inserting Printing ArrayList
		System.out.println("After Inserting" + myList);

		// Modify Element in ArrayList ( Modify/Replace/Change )

		myList.set(0, "Martin Luther");

		// After Modify Printing ArrayList
		System.out.println("After Modify" + myList);

		// Access Specific Element from ArrayList
		System.out.println(myList.get(6)); // Here 6 is an index number

		// Reading All the elements from an ArrayList

		/*
		 * for(int i=0; i<myList.size();i++) {
		 * 
		 * System.out.println(myList.get(i)); }
		 */

		// Using for each loop

		for (Object x : myList) {

			System.out.println(x);
		}

		// Checking ArrayList Empty or Not

		System.out.println("Is ArrayList Empty " + myList.isEmpty());

		// Remove the Multiple Elements from ArrayList
		myList.removeAll(myList);

		// Checking ArrayList Empty or Not

		System.out.println("Is ArrayList Empty " + myList.isEmpty());

	}

}






















