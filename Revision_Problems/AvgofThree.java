import java.util.Scanner;  
// Import Scanner to take input from the user.

class AvgofThree {  
    // Class name (better to name it according to the problem, e.g., AvgofThree)

    public static void main(String[] args) {  
        // Main method: Program execution starts here.

        Scanner sc = new Scanner(System.in);  
        // Create Scanner object 'sc' to read input.

        System.out.print("Enter first number: ");
        float num1 = sc.nextFloat();  
        // Read first float number from user.

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();  
        // Read second float number from user.

        System.out.print("Enter third number: ");
        float num3 = sc.nextFloat();  
        // Read third float number from user.

        float sum = num1 + num2 + num3;  
        // Calculate sum of the three numbers.

        float avg = sum / 3;  
        // Calculate average (sum divided by number of observations, 3 here).

        System.out.println("Average of Numbers: " + avg);  
        // Print the average.
    }
}
