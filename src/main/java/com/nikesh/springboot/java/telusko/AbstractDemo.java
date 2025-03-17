package com.nikesh.springboot.java.telusko;

abstract class Car{
    abstract void drive();
    public void playMusic(){
        System.out.println("Play music");
    }
}

// Concrete Class
class Creta extends Car{
    public void drive(){
        System.out.println("Driving a Creta");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Car car = new Car();
        // We can not create an object of a abstract class.

        Creta creta = new Creta();
        creta.playMusic();
        creta.drive();
    }
}
