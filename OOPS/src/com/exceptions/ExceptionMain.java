package com.exceptions;

import java.util.Arrays;

public class ExceptionMain {

    public static void main(String[] args) {

        try {
            int a = 100;

            int b = 0;
            System.out.println("Line 13");
            int c = a / b;
            System.out.println("Line 15");

            System.out.println("Value of c : " + c);
            System.out.println("Line 18");

        }catch (ArithmeticException ex) {

            System.out.println("Error while doing some math operation : ");
            System.out.println(ex.getMessage());

        }


}


}
