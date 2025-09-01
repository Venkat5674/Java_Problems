import java.util.Scanner;

public class AlarmSystem {
    public static int trigger(int alarm, int bit1, int bit2, int targetBit) {
        int b1 = (alarm >> bit1) & 1;
        int b2 = (alarm >> bit2) & 1;

        if ((b1 ^ b2) == 1) { 
            alarm |= (1 << targetBit); // set target bit
        }

        return alarm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alarm = sc.nextInt();
        int bit1 = sc.nextInt();
        int bit2 = sc.nextInt();
        int targetBit = sc.nextInt();

        System.out.println(trigger(alarm, bit1, bit2, targetBit));

        sc.close();
    }
}
