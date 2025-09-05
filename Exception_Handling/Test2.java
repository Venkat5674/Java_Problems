package demo;

public class Test2 {
	public static void main(String[] args) {
		int num = 10;
		int num2 = 0;

		try {
			int result = num / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Catch block");
		}

		System.out.println("End of the program");

	}
}
