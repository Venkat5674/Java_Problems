public class Test1 {
	public static void main(String[] args) {
		int[] a = {10,20,30};
		
		try {
			System.out.println("try block starts");
			System.out.println(a[-1]);
			System.out.println("try block ends");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch block");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of the program");
		
	}
}
