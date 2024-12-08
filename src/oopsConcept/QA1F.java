package oopsConcept;

public final class QA1F { // Final class - Restricted from inheritance
	
	int x = 550;
	
	public void sum (int a, int b) {
		int c = a + b;
		System.out.println("Sum of a & b: " + c);
	}
	
	public void sum (int a, float b) { // Polymorphism -- Compile time
		float c = a + b;
		System.out.println("Sum of a & b: " + c); 
	} 
	public void sum (int a, int b, int c) { //Overloading
		int d = a + b + c;
		System.out.println("Sum of a & b & c: " + d);
	}
	
	public static void main(String[] args) {
		QA1F q1 = new QA1F();
		q1.sum(20, 30);
		q1.sum(10, 20, 30);
		
		
	}
	
	
}
	
