

package collections;

import collections.A.NSInnerClass;

// Inner classes - 3 - AWT (Abstract window tool)

/*
 * Local, Static, non static 
 */

class A {

	int i = 10;

	class NSInnerClass {
		
		public  void m1() {
			System.out.println("Non static method of Non Static Inner class");
		}
		
		public static void m2() {
			System.out.println("m2 method of NSInner class");
		}
		
		
	}

	public void m1() {
		int a = 10;
		class LocalInner {
			public static void innerMethod() {

			}

		}

	}

}

public class Test5 {
	public static void main(String[] args) {
//		A a = new A();
//		NSInnerClass innerClass = a.new NSInnerClass();
//		innerClass.m1();
		
//		NSInnerClass.m2();
	}
}
