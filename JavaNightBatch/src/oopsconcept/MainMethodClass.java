package oopsconcept;

public class MainMethodClass implements InterfaceDemo {

	public static void main(String[] args) {

		MainMethodClass obj=new MainMethodClass();

		obj.a();
		obj.b();
		obj.c();


	}

	@Override
	public void a() {
		System.out.println("A Method");

	}

	@Override
	public void b() {
		System.out.println("B Method");

	}

	@Override
	public void c() {
		System.out.println("C Method");

	}

}
