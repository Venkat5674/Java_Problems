import java.util.Scanner;

public class ContinuousAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of rows

        int count = 0; // keeps track of letters printed
        for (int i = 1; i <= N; i++) { // iterate over rows
            for (int j = 1; j <= i; j++) { // letters in current row
                char ch = (char)('A' + count % 26); // loop back to A after Z
                System.out.print(ch);
                if (j != i) System.out.print(" "); // space between letters
                count++;
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
