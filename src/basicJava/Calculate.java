package basicJava;

public class Calculate {
	
	public void sum() { 
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The sum of a & b: " + c);
	}
	
	public Calculate() {  // Constructor & Overloading
		int a = 20;
		int b = 30;
		int c = a + b;
		System.out.println("Const - is sum of a&b: " + c);
	}
	
	public Calculate(int a) {  // Constructor
		int b = 30;
		int c = a + b;
		System.out.println("Const - is sum of a&b: " + c);
	}
	
	
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("a + b = " + c);
		return c;
	}

	public static void main(String[] args) {
		Calculate myObj = new Calculate();
		myObj.sum();
		myObj.add(15, 40);
		
		int x = myObj.add(10, 20);
		myObj.add(x, 30);
	}

}
