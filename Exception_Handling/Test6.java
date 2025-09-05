package demo2;



/*
 * 
 * try{
 * 	Test1.main();
 * }catch(Throwable t){
 * 	t.printStackTrace();
 * }
 * 
 * 
 * 
 * 
 */


public class Test6 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main starts");
		task();
		System.out.println("main ends");
	}
	
	public static void task() throws ClassNotFoundException {
		System.out.println("task started");
		Class.forName("demo2.Test2");
		System.out.println("task ended");
	}
}
