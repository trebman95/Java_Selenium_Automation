package basicJava;

public class FirstClass { // Create a Class
	
	int a = 100; // Global variable
	
	public void printdata() { // Create a Method
		int a = 10; // Local variable
		float b = 10.5f; //Example of a keyword "float"
		char c = 'X';
		String d = "xyz";  
		boolean e = false;
		final int f = 20; // Constant
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	
	public void printValue() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {  // Create a Main Method
		FirstClass myObj = new FirstClass();  // Create an Object
		myObj.printdata();
		myObj.printValue();
		
	}
}
