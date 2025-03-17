package com.nikesh.springboot.java.telusko;

import lombok.Getter;

import java.util.ArrayList;

class Mobile{
    private String mobileName;
    private int price;
    static String name = "Mobile Phone";

    @Override
    public String toString() {
        return "Mobile{" +  "mobileName = " + mobileName + ", price = " + price + ", name = " + name + '}' ;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMobileName() {
        return mobileName;
    }

    public int getPrice() {
        return price;
    }

    static {
        String userName = "Venkata Nikesh";
        System.out.println("In a Static Block");
    }

    public void laptopScreen(){
        System.out.println("In a non static Laptop Screen");
    }

    public static void screen (){
        System.out.println("In a Static Method Screen");
    }
}

public class MobileDemo {
    public static void main(String[] args) {
        ArrayList<Mobile> mobiles = new ArrayList<>();

        Mobile motorola = new Mobile();
        motorola.setMobileName("Motorola Edge 60");
        motorola.setPrice(50_000);
        mobiles.add(motorola);

        Mobile iphone = new Mobile();
        iphone.setMobileName("Iphone 14");
        iphone.setPrice(60_000);
        mobiles.add(iphone);

        System.out.println(mobiles);

        for (Mobile m : mobiles) {
            System.out.println(m.getMobileName());
            System.out.println(m);
            System.out.println();
        }

        Mobile testingMobile = new Mobile();
        testingMobile.setMobileName("OnePlus 8 pro");
        testingMobile.setPrice(50_000);
        System.out.println(testingMobile);
        testingMobile.laptopScreen();
        Mobile.screen();
    }
}
