import java.util.Scanner;

public class SignalFilter {
    public static int filter(int signal, int threshold, int conditionBit, int targetBit) {
        int cond = (signal >> conditionBit) & 1;

        if (signal < threshold && cond == 1) {
            signal &= ~(1 << targetBit); // clear target bit
        }

        return signal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int signal = sc.nextInt();
        int threshold = sc.nextInt();
        int conditionBit = sc.nextInt();
        int targetBit = sc.nextInt();

        System.out.println(filter(signal, threshold, conditionBit, targetBit));

        sc.close();
    }
}
