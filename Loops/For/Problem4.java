import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        String s = sc.next();

        // Constraints: 1 ≤ length ≤ 100
        if (s.length() < 1 || s.length() > 100) {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;

        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        // Output the count
        System.out.println(count);

        sc.close();
    }
}
