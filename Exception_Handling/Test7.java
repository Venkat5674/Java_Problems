package demo2;

public class Test7 {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			task();
		} catch (ArithmeticException e) {
			System.out.println("Catch block");
		}
		System.out.println("main ends");
	}
	
	public static void task() throws ArithmeticException{
		System.out.println("task starts");
		System.out.println(10/0);
		System.out.println("task ends");
		
		
	}
}
