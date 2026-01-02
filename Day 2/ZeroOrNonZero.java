import java.util.Scanner;

class ZeroOrNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0)
            System.out.println("Zero");
        else
            System.out.println("Non-Zero");
    }
}
