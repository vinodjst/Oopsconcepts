package com.exceptions;

import java.util.Arrays;

public class ClassNotFoundExceptionTest {

    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("com.exceptions.IOExceptionDemo");

            System.out.println(aClass.getName());

        } catch (ClassNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println("class is not available with this name");
        }


    }
}
