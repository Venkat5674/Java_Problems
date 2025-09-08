import java.util.Scanner;

public class PalindromeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        int num = 1;

        while (num <= N) {
            if (isPalindrome(num)) {
                count++;
            }
            num++;
        }

        System.out.println(count);
    }

    // Helper method to check palindrome
    public static boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
