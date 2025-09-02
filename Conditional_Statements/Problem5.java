import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // read first character

        // Check if it's an alphabet
        if (Character.isLetter(ch)) {
            // Convert to lowercase for easy checking
            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println("Not an alphabet!");
        }

        sc.close();
    }
}
