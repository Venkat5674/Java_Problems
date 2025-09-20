import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of rows

        for (int i = 1; i <= N; i++) { // for each row
            for (int j = 1; j <= i; j++) { // print i stars
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }

        sc.close();
    }
}
