package com.nikesh.springboot.java.telusko;

import lombok.Data;

import java.util.ArrayList;

@Data
class Mobile{
    private String mobileName;
    private int price;
    static String name = "Mobile Phone";

    @Override
    public String toString() {
        return "Mobile{" +  "mobileName = " + mobileName + ", price = " + price + ", name = " + name + '}' ;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Mobile.name = name;
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

    }
}
