package com.nikesh.springboot.java.telusko;

class BasicCalculator{
    // Method OverLoading
    public int addition(int a, int b){
        return a+b;
    }
    public double addition(double a, double b){
        return a+b;
    }
    public int addition(int a, int b, int c){
        return a+b+c;
    }
    public int subtract(int a, int b){
        return a-b;
    }
}

class AdvanceCalculator extends BasicCalculator{
    // Method OverRiding
    public int addition(int a, int b){
        return a+b+100;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int division(int a, int b){
        return a/b;
    }
}

public class MethodOverLoadingAndOverRiding {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.print(basicCalculator.addition(2, 3) + " ");
        System.out.print(basicCalculator.addition(13.3, 7.8) + " ");
        System.out.print(basicCalculator.addition(11, 13, 15) + " ");
        System.out.println(basicCalculator.subtract(13, 7));

        AdvanceCalculator advanceCalculator = new AdvanceCalculator();
        System.out.print(advanceCalculator.addition(2, 3) + " ");
        System.out.print(advanceCalculator.multiplication(2, 3) + " ");
        System.out.println(advanceCalculator.division(15, 3));
    }
}
