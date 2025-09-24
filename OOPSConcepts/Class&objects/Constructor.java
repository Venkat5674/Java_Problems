class Test{
    public static void main(String [] args){
        Point p = new Point(10,20);
        p.print();
    }
}

class Point{
    int x, y;
    Point(int a, int b){
        this.x = a;
        this.y = b;
        
    }
    void print(){
        System.out.println("x = " + x + " Y = " + y);
    }
}

