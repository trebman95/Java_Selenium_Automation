package oopsConcept;

public class QA4 extends QA2 { // multiple inheritance
	
	public void div (int a, int b) {
		int c = a / b;
		System.out.println("Division of a & b: " + c);
	}
	
	public static void main(String[] args) {
		QA4 qa4 = new QA4();
		//qa4.multiple(20, 30);
		qa4.subs(20, 30);
		qa4.sum(20, 30);
		
	}
	
	
}
	
