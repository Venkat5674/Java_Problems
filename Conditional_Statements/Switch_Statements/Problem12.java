import java.util.Scanner;

class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int salary = sc.nextInt();

        int bonus;
        String result;

        switch (code) {
            case 1: // Manager → 10% of salary
                bonus = (salary * 10) / 100;
                result = String.valueOf(bonus);
                break;

            case 2: // Developer → 5% of salary
                bonus = (salary * 5) / 100;
                result = String.valueOf(bonus);
                break;

            case 3: // Intern → flat $500
                bonus = 500;
                result = String.valueOf(bonus);
                break;

            default: // Invalid role
                result = "Invalid Role";
        }

        System.out.println(result);
        sc.close();
    }
}
