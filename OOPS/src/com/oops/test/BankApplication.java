package com.oops.test;


import com.oops.test.model.AxisBank;

import com.oops.test.model.CustomerService;
import com.oops.test.model.HdfcBank;
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {


        System.out.println("Welcome to banking...!");

        //Bank class --parent
        //we have multiple banks
        //Customer
        //bank services
        //register banks

        AxisBank axisBank = new AxisBank();//object creation or instance
        //parent class
        axisBank.setBankName("AXIS");
        axisBank.setBranch("MVP");
        axisBank.setCodeIFSC("AXIS48548594");

        //child class
        axisBank.setTest("testing...");

        //methods
        axisBank.getBankUpdates();
        axisBank.bankROI();

        //insert into db  -axisBank
        System.out.println(axisBank);


        HdfcBank hdfcBank = new HdfcBank();
        //parent class vars- bank
        hdfcBank.setBankName("HDFC");
        hdfcBank.setBranch("NAD");
        hdfcBank.setCodeIFSC("ISND7777");

        //child var
        //methods
        hdfcBank.getBankUpdates();
        hdfcBank.bankROI();

        //insert into db
        System.out.println(hdfcBank);

        //customer
        System.out.println("========================Register Customer==========================");
        System.out.println("Enter your details...");

        CustomerService customerService = new CustomerService();
        customerService.openAccount();
        System.out.println("Account is created please select below banking options");
        System.out.println("1.showBalance 2.withdraw 3.deposit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice){

            case 1: customerService.showBalance();
                    break;
            case 2: customerService.withdraw();
                    break;
            case 3: customerService.deposit();
                    break;
            default:
                System.out.println("Invalid option");

        }


    }

}
