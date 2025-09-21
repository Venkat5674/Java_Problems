import java.util.Scanner;  
// Import Scanner class to take input from user.

class SwapTwo {  
    // Class name

    public static void main(String[] args) {  
        // Main method

        Scanner sc = new Scanner(System.in);  
        // Create Scanner object to read input

        System.out.print("Enter first number: ");
        int a = sc.nextInt();  
        // Read first integer

        System.out.print("Enter second number: ");
        int b = sc.nextInt();  
        // Read second integer

        System.out.println("Before Swapping: " + a + " " + b);  
        // Display numbers before swapping

        // Swap using XOR
        a = a ^ b;  // Step 1: a becomes a XOR b
        b = a ^ b;  // Step 2: b becomes original a
        a = a ^ b;  // Step 3: a becomes original b

        System.out.println("After Swapping: " + a + " " + b);  
        // Display numbers after swapping
    }
}
