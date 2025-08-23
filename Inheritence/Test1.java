package com.pratice.oops.Inheritence;

public class Test1 {

    public static void main(String[] args) {
        BMW bmw = new BMW("Black", 900000, "Edho okati", 8, 0, 280);
        bmw.start();
        bmw.accelerate();
        bmw.playMusic();
        bmw.display();

        Audi audi = new Audi("Red", 900000, "Q8", 4, 0, 400);
        audi.start();
        audi.sunRoof();
        audi.sunRoof();

        SimpleCalculator sc = new SimpleCalculator();
        sc.add(10, 5);

        IntermediateCalculator ic = new IntermediateCalculator();
        ic.pow(2, 5);
        ic.sqrt(16);

        AdvancedCalculator ac = new AdvancedCalculator();
        ac.fact(5);
        ac.log(100, 10);
    }
}
