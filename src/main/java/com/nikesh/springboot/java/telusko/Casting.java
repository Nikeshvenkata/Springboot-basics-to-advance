package com.nikesh.springboot.java.telusko;

class Apple{
    public void show1(){
        System.out.println("In show1");
    }
}

class Ball extends Apple{
    public void show2(){
        System.out.println("In show2");
    }
}

public class Casting {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        apple1.show1();

        Apple apple2 = new Ball();
        apple2.show1();
        // apple2.show2();

        Ball ball1 = new Ball();
        ball1.show1();
        ball1.show2();

        // Ball ball2 = new Apple();

    }
}
