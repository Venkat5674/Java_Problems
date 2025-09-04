import java.util.Scanner;

class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // use long because 3*n+1 can get large

        if (n < 1 || n > 1000000) {
            System.out.println("Invalid Input");
            return;
        }

        int length = 1; // count the starting number as well
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            length++;
        }

        System.out.println(length);
    }
}
