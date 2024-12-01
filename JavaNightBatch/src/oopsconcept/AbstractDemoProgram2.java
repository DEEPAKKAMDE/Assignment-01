package oopsconcept;

public class AbstractDemoProgram2 extends AbstarctDemoProgram {

	public static void main(String[] args) {

		AbstractDemoProgram2 obj = new AbstractDemoProgram2();
		obj.a();
		obj.eat();


		// Note:-
		// We can not create an object of abstract class and interface

	}

	@Override
	void eat() {
		System.out.println("I am Eating");

	}

}
