import java.util.Scanner;

class WeatherAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();   // Condition code
        int temp = sc.nextInt();   // Temperature in °C

        String result;

        switch (code) {
            case 1: // Sunny
                result = "Sunny";
                break;

            case 2: // Rainy
                result = "Rainy";
                break;

            case 3: // Stormy
                if (temp < 10) {
                    result = "Severe Warning";
                } else {
                    result = "Stormy";
                }
                break;

            default: // Invalid condition
                result = "Invalid Condition";
        }

        System.out.println(result);
        sc.close();
    }
}
