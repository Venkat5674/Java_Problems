import java.util.Scanner;

public class ResetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int status = sc.nextInt();       // current status
        int bitPosition = sc.nextInt();  // bit to reset
        
        int result = resetBit(status, bitPosition);
        
        System.out.println(result);
        
        sc.close();
    }

    public static int resetBit(int status, int bitPosition) {
        int mask = 1 << bitPosition;   // create mask
        return status & ~mask;         // reset bit
    }
}
