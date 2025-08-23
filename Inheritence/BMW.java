package com.pratice.oops.Inheritence;

public class BMW extends Car {

    public BMW(String color, double price, String model, int mileage, int speed, int topSpeed) {
        super(color, price, model, mileage, speed, topSpeed);
    }

    public void playMusic() {
        System.out.println("Songs are playing");
    }

    public void display() {
        System.out.println(this.color + " " + this.mileage + " " + this.model + " " + this.price + " " + this.speed + " " + this.topSpeed);
    }
}


