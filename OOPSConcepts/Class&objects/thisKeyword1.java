class Test{
    public static void main(String [] args){
        Point p1 = new Point(10,20);
        Point p2 = new Point(5, 15);
        p1.print();
        p2.print();
    }
}

class Point{
    int x, y;
    Point(int a, int b){
        this.x = a;
        this.y = b;
        
    }
    void print(){
        System.out.println("x = " + x + " y = " + y);
    }
}

