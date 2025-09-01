import java.util.Scanner;

public class SecuritySystem {
    public static int override(int lockState, int bit1, int bit2, int targetBit) {
        int b1 = (lockState >> bit1) & 1;
        int b2 = (lockState >> bit2) & 1;

        if (b1 == b2) { 
            lockState |= (1 << targetBit); // set target bit
        }

        return lockState;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lockState = sc.nextInt();
        int bit1 = sc.nextInt();
        int bit2 = sc.nextInt();
        int targetBit = sc.nextInt();

        System.out.println(override(lockState, bit1, bit2, targetBit));

        sc.close();
    }
}
