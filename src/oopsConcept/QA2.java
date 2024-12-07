package oopsConcept;

public class QA2 extends QA1 { // Single level inheritance
	
	public void sum (int a, int b) { // Overriding -- late binding
		int c = a * a + b * b;
		System.out.println("Sum of a & b: " + c);
	}
	
	public void subs (int a, int b) {
		int c = a - b;
		System.out.println("Subtraction of a & b: " + c);
	}
	
	public static void main(String[] args) {
		QA2 q2 = new QA2();
		q2.subs(20, 30);
		//QA1 q21 = new QA1();
		q2.sum(20, 30);
		
	}
	
	
}
	
