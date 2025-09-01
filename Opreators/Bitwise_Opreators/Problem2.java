import java.util.Scanner;

public class SensorCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int control = sc.nextInt();      // control integer
        int bitPosition = sc.nextInt();  // bit to check
        
        boolean result = isSensorActive(control, bitPosition);
        
        System.out.println(result);
        
        sc.close();
    }

    public static boolean isSensorActive(int control, int bitPosition) {
        int mask = 1 << bitPosition;     // create mask
        return (control & mask) != 0;    // check if bit is set
    }
}
