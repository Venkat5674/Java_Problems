import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: three integers n, low, high
        int n = sc.nextInt();
        int low = sc.nextInt();
        int high = sc.nextInt();

        // Check if n is within [low, high]
        if (n >= low && n <= high) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }

        sc.close();
    }
}
