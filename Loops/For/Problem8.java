import java.util.Scanner;

public class FirstNegativeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int N = sc.nextInt();

        // Constraints: 1 ≤ N ≤ 100
        if (N < 1 || N > 100) {
            System.out.println("Invalid Input");
            return;
        }

        int index = -1;  // default if no negative found

        // Read N sensor readings
        for (int i = 1; i <= N; i++) {
            int reading = sc.nextInt();

            // Check for first negative
            if (reading < 0 && index == -1) {
                index = i;  // store 1-based index
            }
        }

        // Output result
        System.out.println(index);

        sc.close();
    }
}
