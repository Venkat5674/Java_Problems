package demo;

class A{
	
	static int i= 10;
	static {
		System.out.println("static blocks from A class");
	}
	
}
// Checked Exceptions - Compiler Known Exceptions
// UnChecked Exceptions - Compiler UnKnown Exceptions
public class Test5 {
	
	static{
		System.out.println("Static block from Test5 class");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		try {
			Class.forName("demo.A");
		}catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
	}
}





