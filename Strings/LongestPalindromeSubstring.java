import java.util.Scanner;

public class LongestPalindromeSubstring {

    // Function to expand from the center and return palindrome length
    public static String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // return the palindrome substring
        return s.substring(left + 1, right);
    }

    // Function to find the longest palindrome substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1)
            return "";

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String odd = expandFromCenter(s, i, i);
            // Even length palindrome
            String even = expandFromCenter(s, i, i + 1);

            // Compare and store the longest one
            String currentLongest = odd.length() > even.length() ? odd : even;
            if (currentLongest.length() > longest.length()) {
                longest = currentLongest;
            }
        }
        return longest;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);

        sc.close();
    }
}
