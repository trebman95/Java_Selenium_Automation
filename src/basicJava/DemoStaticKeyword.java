package basicJava;

public class DemoStaticKeyword {

		public static void val() { // "Static" keyword
			int x = 20; // Has to be inside static to run
			System.out.println(x);
		}
		
		public static void main(String[] args) {
			
			//DemoStaticKeyword dsk = new DemoStaticKeyword();
			//dsk.val();
			
			val();
		}
}
