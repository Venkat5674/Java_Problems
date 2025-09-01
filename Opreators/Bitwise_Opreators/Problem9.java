import java.util.Scanner;

public class DeviceStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int status = sc.nextInt();
        int threshold = sc.nextInt();
        int bitPosition = sc.nextInt();

        int result = updateStatus(status, threshold, bitPosition);
        System.out.println(result);

        sc.close();
    }

    public static int updateStatus(int status, int threshold, int bitPosition) {
        if (status > threshold) {
            // preserve only the specific bit
            return status & (1 << bitPosition);
        } else {
            // threshold not met → keep status unchanged
            return status;
        }
    }
}
