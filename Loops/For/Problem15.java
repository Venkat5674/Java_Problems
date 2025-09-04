import java.util.Scanner;

class PalindromeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 1 || N > 1000) {
            System.out.println("Invalid Input");
            return;
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Function to check if a number is palindrome
    private static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
