// Non-static Inner Class (Member Inner Class)

// Defined inside another class without the static keyword.

// Can access all members (even private) of the outer class.

// Needs an object of the outer class to create its object.


class Outer {
	private String message = "Hello from Outer!";
 
 	class Inner{
 		void display() {
 			System.out.println(message);
 		}
 	}
}
public class Main{
	public static void main(String [] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
}
