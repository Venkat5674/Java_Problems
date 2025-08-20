import java.util.Scanner;

class Book {
    String title, author;

    Book() {
        this("Unknown");
    }

    Book(String title) {
        this(title, "Not Specified");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        b1.display();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        Book b2 = new Book(title);
        b2.display();

        System.out.print("Enter Book Title: ");
        String t = sc.nextLine();
        System.out.print("Enter Author: ");
        String a = sc.nextLine();
        Book b3 = new Book(t, a);
        b3.display();
    }
}
