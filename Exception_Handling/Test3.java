package demo;

public class Test3 {
	public static void main(String[] args) {
		int[] a = {10,20,0};
		try {
			int num1 = a[0];
			int num2 = a[2];
			int result = num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Catch block");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBoundsException Catch block");
		}
		
		System.out.println("End of Program");
	}
}
