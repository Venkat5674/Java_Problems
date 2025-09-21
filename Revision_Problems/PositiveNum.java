import java.util.Scanner;  
// Import Scanner class to read input from the user

class PositiveNum {  
    // Class name

    public static void main(String[] args) {  
        // Main method: execution starts here

        Scanner sc = new Scanner(System.in);  
        // Create Scanner object to read input

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  
        // Read an integer number from the user

        if(num > 0) {  
            // Check if the number is positive
            System.out.println(num + " is a Positive Number");
        } else if(num < 0) {  
            // Check if the number is negative
            System.out.println(num + " is a Negative Number");
        } else {  
            // If the number is neither positive nor negative
            System.out.println(num + " is Zero");
        }
    }
}
