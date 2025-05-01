package com.oops.inheritance;

public class BabyDog extends  Dog {

    private String weight;

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {

        BabyDog babyDog = new BabyDog();
        babyDog.setAge(2);//animal
        babyDog.setName("zbc");//animal

        babyDog.setBrd("xyz");//dog
        babyDog.setWeight("2kg");//baby dog

    }
}
