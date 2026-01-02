import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 5");
    }
}
