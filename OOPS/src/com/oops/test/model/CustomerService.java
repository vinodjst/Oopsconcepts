package com.oops.test.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerService {

    //open an acccount
    //show balance
    //withdraw
    //deposit
    Customer customer = new Customer();

    public void showBalance(){

        System.out.println("Hi " + customer.getName() +" your bal is "+customer.getAccount().getAccBalance());
    }

    public void withdraw(){

        System.out.println("You want you withdraw all the money");


    }


    public void deposit(){

        System.out.println("Deposit all the money");
    }



    public void openAccount(){

    try {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter you Name : ");

    customer.setId(1);
    customer.setName(scanner.next());

    System.out.println("Enter you Age : ");

    customer.setAge(scanner.nextInt());


    System.out.println("Enter your Email : ");
    customer.setEmail(scanner.next());

    System.out.println("=================ENTER ADDRESS===========================================");
    Address address = new Address();
    System.out.println("Enter you Area : ");
    address.setArea(scanner.next());

    System.out.println("Enter you Street : ");
    address.setStreet(scanner.next());

    System.out.println("Enter you Dist : ");
    address.setDist(scanner.next());

    System.out.println("Enter you State : ");
    address.setState(scanner.next());

    System.out.println("Enter you pinCode : ");
    address.setPinCode(scanner.next());

    customer.setAddress(address);

    System.out.println("=================ENTER ACCOUNT DETAILS===========================================");
    Account account = new Account();

    System.out.println("Enter accont number :");
    account.setAccountNumber(scanner.nextLong());

    System.out.println("Enter IFSC code:");
    account.setIfscCode(scanner.next());

    System.out.println("Enter branch name :");
    account.setBranch(scanner.next());

    System.out.println("Enter balance number :");
    double bal = scanner.nextDouble();
    account.setAccBalance(bal);

    customer.setAccount(account);

    System.out.println("Account created with below details \n" + customer);

    }catch (InputMismatchException ex){
        System.out.println("Wrong input");
    }
    }



}
