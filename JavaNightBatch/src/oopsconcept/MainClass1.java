package oopsconcept;

public class MainClass1 implements Z {

	public static void main(String[] args) {

		MainClass1 obj=new MainClass1();
		obj.a();
		obj.b();

	}

	@Override
	public void a() {
		System.out.println("A Method from Y interface");

	}

	@Override
	public void b() {

		System.out.println("B Method from Z interface ");
	}

}
