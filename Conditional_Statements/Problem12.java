import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: weight (kg) and height (m)
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        // Calculate BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Classify BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        sc.close();
    }
}
