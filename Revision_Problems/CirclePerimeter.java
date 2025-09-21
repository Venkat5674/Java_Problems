import java.util.Scanner;  
// Import Scanner class for taking input from the user

class CirclePerimeter {  
    // Class name

    public static void main(String[] args) {  
        // Main method: execution starts here

        Scanner sc = new Scanner(System.in);  
        // Create Scanner object to read input

        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();  
        // Read the radius of the circle as a double

        double perimeter = 2 * 3.14 * r;  
        // Calculate perimeter (circumference) of the circle using formula 2 * π * r

        System.out.println("Perimeter (Circumference) of the Circle: " + perimeter);  
        // Print the perimeter
    }
}
