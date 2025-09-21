import java.util.Scanner;  
// Import Scanner class to take input from the user

class RectArea {  
    // Class name

    public static void main(String[] args) {  
        // Main method

        Scanner sc = new Scanner(System.in);  
        // Create Scanner object to read input

        System.out.print("Enter length of rectangle: ");
        int a = sc.nextInt();  
        // Read length as an integer

        System.out.print("Enter width of rectangle: ");
        int b = sc.nextInt();  
        // Read width as an integer

        float area = (float) a * b;  
        // Calculate area
        // Explicitly casting to float to allow decimal precision if needed

        System.out.println("Area of Rectangle: " + area);  
        // Display the area
    }
}
