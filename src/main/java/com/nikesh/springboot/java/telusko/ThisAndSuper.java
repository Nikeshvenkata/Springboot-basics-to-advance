package com.nikesh.springboot.java.telusko;

class A extends Object{
    A(){
        super();
        System.out.println("A Constructor");
    }
    A(int n){
        super();
        System.out.println("Int A Constructor");
    }
}

class B extends A{
    B(){
        super();
        System.out.println("B Constructor");
    }
    B(int n){
        super();
        System.out.println("Int B Constructor");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(13);
    }
}
