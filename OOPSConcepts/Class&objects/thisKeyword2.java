class Test{
    public static void main(String [] args){
        Point p1 = new Point(10,20);
        Point p2 = new Point(5, 15);
        Point p3 = new Point();
        p1.print();
        p2.print();
        p3.print();
    }
}

class Point{
    int x, y;
    Point(int a, int b){
        this.x = a;
        this.y = b;
        
    }
    
    Point(){
        this(10, 10);
    }
    void print(){
        System.out.println("x = " + x + " y = " + y);
    }
}

