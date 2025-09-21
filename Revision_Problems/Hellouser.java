import java.util.Scanner;  
// This imports the Scanner class from java.util package.
// Scanner is used to take input from the user.

class Hellouser {  
    // This defines a class named 'Hellouser'.
    // Every Java program must have at least one class.

    public static void main(String[] args) {  
        // This is the main method.
        // The JVM starts executing the program from this method.

        Scanner sc = new Scanner(System.in);  
        // Create a Scanner object named 'sc' to read input from the console.

        String user = sc.nextLine();  
        // Reads a full line of text entered by the user and stores it in the variable 'user'.

        System.out.println("Hello," + user + " !");  
        // Prints the message "Hello, [user] !" to the console.
        // The '+' operator is used to concatenate strings.
    }
}
