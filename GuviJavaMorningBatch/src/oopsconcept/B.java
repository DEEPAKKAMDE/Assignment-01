package oopsconcept;

public class B extends A{
	
	
	public void multiply(int x,int y) {
		z=x*y;
		System.out.println("Multiplication is "+z);
	}

	public static void main(String[] args) {
		
		B obj=new B();
		obj.add(10, 30);
		obj.multiply(12, 5);
		

	}

}
