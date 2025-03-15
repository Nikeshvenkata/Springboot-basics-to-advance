package com.nikesh.springboot.java.telusko;

class Computer {
    public void playMusic() {
        System.out.println("Playing Music by Nikesh");
    }
    public String getMeAPen(int cost){
        return ("The cost of pen is " + cost);
    }
}

public class Idea {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.playMusic();
        System.out.println(computer.getMeAPen(5));
    }
}
