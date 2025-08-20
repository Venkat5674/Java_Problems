import java.util.Scanner;

class Employee {
    int id;
    String name;

    Employee setDetails(int id, String name) {
        this.id = id;
        this.name = name;
        return this; // method chaining
    }

    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        new Employee().setDetails(id, name).display();
    }
}
