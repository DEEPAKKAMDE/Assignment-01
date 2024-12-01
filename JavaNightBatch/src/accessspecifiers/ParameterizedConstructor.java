package accessspecifiers;

public class ParameterizedConstructor {

	int id; // Global Variable
	String name; // Global Variable
	String address; // Global Variable

	// Default Constructor
	ParameterizedConstructor() {

		System.out.println("Hello Default Constructor");
	}

	// Parameterized Constructor
	ParameterizedConstructor(int a, String b, String c) {
		id = a;
		name = b;
		address = c;

	}


	public void display() {

		System.out.println(id+" "+name+" "+address);
	}

	public static void main(String[] args) {

		// Calling Default Construcor
		ParameterizedConstructor obj=new ParameterizedConstructor();

		// Calling Parameterized Constructor
		ParameterizedConstructor pc1=new ParameterizedConstructor(101, "Simon", "Nagpur");
		ParameterizedConstructor pc2=new ParameterizedConstructor(102, "Peter", "Pune");

		pc1.display();
		pc2.display();

	}

}
