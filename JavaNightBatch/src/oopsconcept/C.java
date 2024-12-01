package oopsconcept;

public class C extends B{

	public void c() {
		System.out.println("This is c method");
	}

	public static void main(String[] args) {

		C obj=new C();
		obj.a();
		obj.b();
		obj.c();


	}

}
