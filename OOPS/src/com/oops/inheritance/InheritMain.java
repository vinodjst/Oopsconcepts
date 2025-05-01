package com.oops.inheritance;

import java.util.Arrays;

public class InheritMain {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setName("tommy");
        dog.setAge(3);
        dog.setBrd("pam");
        dog.sound();


        Horse horse = new Horse();

        horse.setAge(13);
        horse.setName("Rockey");
        horse.setRunningSpeed(300);
        horse.sound();

    }
}
