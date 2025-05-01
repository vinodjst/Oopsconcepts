package com.oops.inheritance;

public class Animal {

    private String name;

    private  int age;

    void sound(){

        System.out.println("aniamls make sounds");

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
