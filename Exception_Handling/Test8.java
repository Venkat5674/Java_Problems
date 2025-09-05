package demo2;

// throw new ExceptionClassName();
public class Test8 {
	public static void main(String[] args) throws ClassNotFoundException{
		
		System.out.println("main starts");
		throw new ClassNotFoundException("Divide by zero");
		
	}
}
