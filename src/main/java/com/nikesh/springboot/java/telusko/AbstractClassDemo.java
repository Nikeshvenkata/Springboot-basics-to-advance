package com.nikesh.springboot.java.telusko;

interface Computers{
    final static int age = 25;
    public abstract void code();
}

class Laptop implements Computers{
    public void code(){
        System.out.println("Coding in a Laptop");
    }
}

class Desktop implements Computers{
    public void code(){
        System.out.println("Coding in a Desktop");
    }
}

class Developer {
    public void developApplication (Computers machine){
        machine.code();
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Computers lap = new Laptop();
        Computers desk = new Desktop();

        Developer nikesh = new Developer();
        nikesh.developApplication(desk);
        System.out.println(Computers.age);
    }
}
