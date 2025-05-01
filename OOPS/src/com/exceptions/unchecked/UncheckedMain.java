package com.exceptions.unchecked;

import java.util.Arrays;

public class UncheckedMain {

    public static void main(String[] args) {

        try {
            Employee employee = new Employee();

            //i want to get the name from employee

            employee.setName("Ajay Kumar");
            String name = employee.getName();

            System.out.println("Name :: " + name);

            String[] s = name.split(" ");

            System.out.println("First Name :: "+ s[0]);
            System.out.println("Last Name :: "+ s[1]);

            System.out.println("Error :: "+ s[2]);


        }catch (NullPointerException ex){
            System.out.println("Something is wrong please come after some time --- Null pointer");
            System.out.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Something is wrong please come after some time --- ArrayIndex");
            System.out.println(ex.getMessage());
        }

        System.out.println("END OF THE PROGRAM");

    }
}
