package com.pratice.oops.Inheritence;

public class Audi extends Car {

    boolean isSunRoofOpened;

    public Audi(String color, double price, String model, int mileage, int speed, int topSpeed) {
        super(color, price, model, mileage, speed, topSpeed);
    }

    public void sunRoof() {
        if (isSunRoofOpened) {
            isSunRoofOpened = false;
            System.out.println("Sun roof is closed");
        } else {
            isSunRoofOpened = true;
            System.out.println("Sun roof is opened");
        }
    }
}
