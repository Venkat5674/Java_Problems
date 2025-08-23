package com.pratice.oops.Inheritence;

public class Benz extends Car {

    public Benz(String color, double price, String model, int mileage, int speed, int topSpeed) {
        super(color, price, model, mileage, speed, topSpeed);
    }

    public void onAmbientMode() {
        System.out.println("Ambient mode is turned on");
    }

    public void offAmbientMode() {
        System.out.println("Ambient mode is turned off");
    }
}
