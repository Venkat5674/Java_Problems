import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int status = sc.nextInt();       // current status
        int bitPosition = sc.nextInt();  // bit to set
        
        int result = setBit(status, bitPosition);
        
        System.out.println(result);
        
        sc.close();
    }

    public static int setBit(int status, int bitPosition) {
        int mask = 1 << bitPosition;   // create mask
        return status | mask;          // set the bit
    }
}
