package com.nikesh.springboot.java.telusko;

abstract class First{
    public abstract void show();
    public abstract void config();
    public void show2(){
        System.out.println("First Show 2");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
         First obj = new First(){
            public void show(){
                System.out.println("Show using anonymous inner class");
            }
            public void config(){
                System.out.println("Config using anonymous inner class");
            }
        };
        obj.show();
        obj.config();
        obj.show2();
    }
}
