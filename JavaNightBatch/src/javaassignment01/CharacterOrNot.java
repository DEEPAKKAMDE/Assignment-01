package javaassignment01;

public class CharacterOrNot {

	public static void main(String[] args) {

		char ch = 'A'; // Local Variable

		if (ch == 'a' || ch == 'e' || ch == 'i'
				|| ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("It's an Vowel");
		}

		else {
			System.out.println("Its a Consunant");
		}

	}

}
