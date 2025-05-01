package com.oops.inheritance;

public class Bird extends Animal  {

    private String birdType;

    public String getBirdType() {
        return birdType;
    }

    public void setBirdType(String birdType) {
        this.birdType = birdType;
    }

    public static void main(String[] args) {


        Bird bird = new Bird();

        bird.setAge(20);//animal
        bird.setName("abc");//animal
        bird.setBirdType("small");//bird class
    }
}
