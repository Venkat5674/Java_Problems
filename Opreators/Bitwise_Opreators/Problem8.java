import java.util.Scanner;

public class BitSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int signal = sc.nextInt();  // input signal
        int bit1 = sc.nextInt();    // first bit position
        int bit2 = sc.nextInt();    // second bit position

        int result = swapBits(signal, bit1, bit2);
        System.out.println(result);

        sc.close();
    }

    public static int swapBits(int signal, int bit1, int bit2) {
        // Extract the two bits
        int b1 = (signal >> bit1) & 1;
        int b2 = (signal >> bit2) & 1;

        // If bits differ, flip them
        if (b1 != b2) {
            signal ^= (1 << bit1) | (1 << bit2);
        }

        return signal;
    }
}
