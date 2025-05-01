package com.oops.inheritance;

public class Horse extends Animal{

   private int runningSpeed;

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    @Override
    void sound() {
        //super.sound();
        System.out.println("horse soundss.....");
    }

    public static void main(String[] args) {


        Horse horse = new Horse();

        horse.setAge(20);
        horse.setName("tommy");
        horse.setRunningSpeed(100);
        horse.sound();
    }
}
