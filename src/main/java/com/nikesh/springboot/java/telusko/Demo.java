package com.nikesh.springboot.java.telusko;

class Calculator{
    public int addition(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
}

class AdvancedCalculator extends Calculator{
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator Addition: " + calculator.addition(13,7));

        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        System.out.println("Adv Calculator Addition: " + advancedCalculator.addition(13,7));
        System.out.println("Adv Calculator Multiply: " + advancedCalculator.multiply(13,7));
    }
}
