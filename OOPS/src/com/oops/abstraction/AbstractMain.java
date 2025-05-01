package com.oops.abstraction;

public class AbstractMain {

    public static void main(String[] args) {
        //data hiding
        //hiding implementation
        //void run(){
    //}
        //void run();  --without body
        //how to achieve --using abstract class and interface


        Shapes rectangle = new Rectangle();
        rectangle.area();
        rectangle.height();
        rectangle.width();

        Square square = new Square();
        square.area();
        square.height();
        square.width();

        Circle circle = new Circle();
        circle.area();



        AnimalInterface animalInterface = new Dog();

        animalInterface.sounds();




        new Dog();

    }




}
