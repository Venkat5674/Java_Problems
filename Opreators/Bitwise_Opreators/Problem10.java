public class DeviceModeUpdater {
    public static int updateMode(int mode) {
        // Check bit 0 (power status)
        if ((mode & 1) == 0) {
            // Power is off → clear bit 1
            mode = mode & (~(1 << 1));
        } else {
            // Power is on → set bit 1
            mode = mode | (1 << 1);
        }
        return mode;
    }

    public static void main(String[] args) {
        int input = 1;  // Example input
        System.out.println(updateMode(input)); // Expected output: 3
    }
}
