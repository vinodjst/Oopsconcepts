package com.oops.statickeyword;

import java.util.Arrays;

public class StaticMain {

    static {
        System.out.println("i will be the first execution point now");
    }

    public static void main(String[] args) {

        //test
        Employee.validateEmail("vi@gmail.com");
        Employee.run();


        Employee employee1 = new Employee();

        employee1.setEmpId(101);
        employee1.setEmpName("Raghu");
        employee1.setEmail("Raghu@gmail.com");
        //employee1.setEmpOrg("HCL");//same
        employee1.displayEmployeeDetails();

        Employee employee2 = new Employee();

        employee2.setEmpId(102);
        employee2.setEmpName("Ramana");
        employee2.setEmail("Ramana@gmail.com");
        //employee2.setEmpOrg("HCL");//same
        employee2.displayEmployeeDetails();


        Employee employee3 = new Employee();

        employee3.setEmpId(103);
        employee3.setEmpName("Chandu");
        employee3.setEmail("Chandu@gmail.com");
        //employee3.setEmpOrg("HCL");
        employee3.displayEmployeeDetails();


    }
}
