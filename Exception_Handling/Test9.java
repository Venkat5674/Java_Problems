package demo2;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = scanner.nextInt();
		if(age>18) {
			System.out.println("Eligible to vote");
		}
		else {
			throw new ArithmeticException("Insufficient age : "+age);
		}
	
	}
}
