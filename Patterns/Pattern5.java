import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of rows

        for (int i = 1; i <= N; i++) { // iterate over rows
            for (int j = 0; j < i; j++) { // print i letters
                char ch = (char)('A' + j); // calculate character
                System.out.print(ch);
                if (j != i - 1) System.out.print(" "); // space between letters
            }
            System.out.println(); // move to next row
        }

        sc.close();
    }
}
