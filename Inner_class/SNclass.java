// Static Nested Class

// Declared with the static keyword.

// Can only access static members of the outer class directly.

// Does not need an object of the outer class.

class Outer{
	static String greeting = "Hello from Static Nested Class";
	
	static class Inner{
		void show() {
			System.out.println(greeting);
		}
	}
}


public class SNclass {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.show();

	}

}
