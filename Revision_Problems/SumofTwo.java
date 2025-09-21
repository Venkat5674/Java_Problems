import java.util.Scanner;  
// Import the Scanner class to read input from the user.

class SumofTwo {  
    // Define a class named 'SumofTwo'.

    public static void main(String[] args) {  
        // Main method: Program execution starts here.

        Scanner sc = new Scanner(System.in);  
        // Create a Scanner object 'sc' to take input from the user.

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();  
        // Read the first integer input from the user and store it in 'num1'.

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();  
        // Read the second integer input from the user and store it in 'num2'.

        int sum = num1 + num2;  
        // Calculate the sum of num1 and num2 and store it in 'sum'.

        System.out.println("Sum of Two Numbers: " + sum);  
        // Print the result to the console.
    }
}
