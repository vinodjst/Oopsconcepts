package com.oops.poly;

public class Calculator {

    //i need method to add two given numbers and return or print the value

    void sum(int a,int b){
        System.out.println("Sum of two numbers is =" +(a+b));
    }

    int sum(int a,int b,int c){

        return a+b+c;
    }

    void sum(double a,double b){
        System.out.println("Sum of two numbers is =" +(a+b));
    }

    void sum(String firstName , String lastName){

        String name = firstName.concat(" "+lastName);

        System.out.println(name);
    }



    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //compile time polymorphism
        calculator.sum(10,20);
        calculator.sum(10,20,30);
        calculator.sum(10.00,40.00);
        calculator.sum("Abhi","ram");
    }

}
