package com.oops.inheritance;

public class Dog  extends  Animal{

   private String brd;

    public String getBrd() {
        return brd;
    }

    public void setBrd(String brd) {
        this.brd = brd;
    }


    @Override
    void sound() {
       // super.sound();//parent class
        //this current class
        System.out.println("dog is barking...");
    }

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setAge(20);
        dog.setName("tommy");
        dog.setBrd("abc");
        dog.sound();
    }
}
