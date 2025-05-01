package com.oops.abstraction;

public class Dog implements AnimalInterface {


    @Override
    public void sounds() {
        System.out.println("Dog is barking");
    }
}
