import java.util.Scanner;

public class SystemValidation {
    public static boolean validate(int status, int bit1, int bit2, int targetBit) {
        int b1 = (status >> bit1) & 1;
        int b2 = (status >> bit2) & 1;
        int t  = (status >> targetBit) & 1;

        return (b1 ^ b2) == t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int status = sc.nextInt();
        int bit1 = sc.nextInt();
        int bit2 = sc.nextInt();
        int targetBit = sc.nextInt();

        System.out.println(validate(status, bit1, bit2, targetBit));

        sc.close();
    }
}
