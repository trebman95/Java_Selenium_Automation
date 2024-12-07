package oopsConcept;

public class QA3 extends QA2 { // multilevel inheritance
	
	public void multiple (int a, int b) {
		int c = a * b;
		System.out.println("Multiplication of a & b: " + c);
	}
	
	public static void main(String[] args) {
		QA3 qa3 = new QA3();
		qa3.multiple(20, 30);
		qa3.subs(20, 30);
		qa3.sum(20, 30);
		
	}
	
	
}
	
