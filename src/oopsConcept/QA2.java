package oopsConcept;

public class QA2 extends QA1 { // Single level inheritance
	
	int x = 100;
	
	public void printVal() {
		int x = 200;
		System.out.println(x);
		
		System.out.println(this.x); // "This" keyword
		
		System.out.println(super.x); // "Super" keyword from QA1
		
		super.sum(20, 30);
	}
	
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
		q2.printVal();	
	}
	
	
}
	
