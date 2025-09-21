import java.util.Scanner;  
// Import Scanner class to take input from the user

class SimpleInterest {  
    // Class name

    public static void main(String[] args) {  
        // Main method: execution starts here

        Scanner sc = new Scanner(System.in);  
        // Create Scanner object to read input

        System.out.print("Enter principal amount (P): ");
        int p = sc.nextInt();  
        // Read principal amount

        System.out.print("Enter time in years (T): ");
        int t = sc.nextInt();  
        // Read time period

        System.out.print("Enter rate of interest (R): ");
        int r = sc.nextInt();  
        // Read rate of interest

        float si = (p * t * r) / 100.0f;  
        // Calculate simple interest
        // Dividing by 100.0f ensures the division is done in float (decimal) 

        System.out.println("Simple Interest: " + si);  
        // Print the simple interest
    }
}
