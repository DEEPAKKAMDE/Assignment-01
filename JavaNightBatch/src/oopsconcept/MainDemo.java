package oopsconcept;

class Test {

	private int value;

	public void setValue(int x) {

		value = x;

	}

	public int getValue() {

		return value;

	}

}

public class MainDemo {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.setValue(200);
		System.out.println(obj.getValue());

	}
}