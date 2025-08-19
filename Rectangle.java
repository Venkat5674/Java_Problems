class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {  // rectangle
        length = l;
        breadth = b;
    }

    Rectangle(int side) {      // square
        length = breadth = side;
    }

    void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(15);

        r1.display();
        r2.display();
    }
}
