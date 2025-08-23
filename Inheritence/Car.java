package com.pratice.oops.Inheritence;

public class Car extends Object {

    String color;
    double price;
    String model;
    int mileage;
    int speed;
    int topSpeed;

    public Car(String color, double price, String model, int mileage, int speed, int topSpeed) {
        this.color = color;
        this.price = price;
        this.model = model;
        this.mileage = mileage;
        this.speed = speed;
        this.topSpeed = topSpeed;
    }

    public void start() {
        this.speed = 10;
        System.out.println("Car is moving with " + this.speed + " km/h");
    }

    public void accelerate() {
        this.speed += 10;
        System.out.println("Car accelerated to " + this.speed + " km/h");
    }

    public void deccelerate() {
        this.speed -= 5;
        System.out.println("Car decelerated to " + this.speed + " km/h");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Car is stopped");
    }
}