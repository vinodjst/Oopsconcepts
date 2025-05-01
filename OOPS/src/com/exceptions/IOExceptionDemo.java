package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class IOExceptionDemo {

    public static void main(String[] args) {


        IOExceptionDemo ioExceptionDemo = new IOExceptionDemo();

        try {
            ioExceptionDemo.readFile();
        } catch (FileNotFoundException e) {

            System.out.println("File no found please try after sometime");
        }


    }


    void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("D://Desktop/GFG.txt");

    }


}
