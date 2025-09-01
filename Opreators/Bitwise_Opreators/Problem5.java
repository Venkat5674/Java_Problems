import java.util.Scanner;

public class ToggleTwoBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int status = sc.nextInt();   // current status
        int bit1 = sc.nextInt();     // first bit to toggle
        int bit2 = sc.nextInt();     // second bit to toggle
        
        int result = toggleTwoBits(status, bit1, bit2);
        
        System.out.println(result);
        
        sc.close();
    }

    public static int toggleTwoBits(int status, int bit1, int bit2) {
        int mask1 = 1 << bit1;   // mask for first bit
        int mask2 = 1 << bit2;   // mask for second bit
        return status ^ mask1 ^ mask2; // toggle both
    }
}
