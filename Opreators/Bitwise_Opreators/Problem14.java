import java.util.Scanner;

public class DeviceCalibration {
    public static int calibrate(int state, int conditionBit, int threshold) {
        int cond = (state >> conditionBit) & 1;

        if (cond == 1 && state > threshold) {
            state = state >> 1; // right shift by 1
        }

        // cap at 0 (not really needed here but per problem statement)
        return Math.max(state, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int state = sc.nextInt();
        int conditionBit = sc.nextInt();
        int threshold = sc.nextInt();

        System.out.println(calibrate(state, conditionBit, threshold));

        sc.close();
    }
}
