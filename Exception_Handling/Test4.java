package demo;

public class Test4 {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
