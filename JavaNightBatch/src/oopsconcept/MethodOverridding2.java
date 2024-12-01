package oopsconcept;

public class MethodOverridding2 extends MtehodOverridding1{

	@Override
	public void eat() {
		// We are using super keyword to call the parent class method
		super.eat();
		System.out.println("You are eating");
	}

	public static void main(String[] args) {

		MethodOverridding2 obj=new MethodOverridding2();
		obj.eat();


	}

}
