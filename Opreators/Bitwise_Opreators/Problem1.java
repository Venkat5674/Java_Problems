import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int status = sc.nextInt();       // read status
        int bitPosition = sc.nextInt();  // read bit position
        
        int result = toggleBit(status, bitPosition);
        
        System.out.println(result);
        
        sc.close();
    }

    public static int toggleBit(int status, int bitPosition) {
        int mask = 1 << bitPosition;  // create mask
        return status ^ mask;         // toggle using XOR
    }
}
