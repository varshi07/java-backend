package com.example.OOPS;

public class Vehicle {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.start();
        car.end();
    }

    public void end() {
        System.out.println("Car Starts");
    }

    public void start() {
        System.out.println("Car Ends");
    }
}
