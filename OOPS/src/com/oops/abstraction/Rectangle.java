package com.oops.abstraction;

public class Rectangle extends Shapes {


    @Override
    void area() {
        System.out.println("Area of rectange");
    }

    @Override
    void height() {

        System.out.println("Height of Rectange");
    }

    @Override
    void width() {
        System.out.println("width of rectangle");
    }
}
