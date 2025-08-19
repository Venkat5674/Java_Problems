class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Venkatesh");
        s1.display();
    }
}
