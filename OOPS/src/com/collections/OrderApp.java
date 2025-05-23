package com.collections;

import java.util.Arrays;
import java.util.Scanner;

public class OrderApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Product Order System ---");
        OrderService orderService = new OrderService();
        while (true) {
            System.out.println("1. Add Product\n" +
                    "2. View Products\n" +
                    "3. Place Order\n" +
                    "4. View Orders\n" +
                    "5. Process order\n" +
                    "6. Undo Last Action\n" +
                    "7. pay \n" +
                    "0. Exit \n");
            System.out.println("Choose :");
            int option = scanner.nextInt();
            orderService.dataSetup();
            switch (option) {
                case 1 -> orderService.addProduct();
                case 2 -> orderService.viewProducts();
                case 3 -> orderService.placeOrder();
                case 4 -> orderService.viewOrder();
                case 5 -> orderService.processOrder();
                case 6 -> orderService.undoLastAction();
                //case 7 -> orderService.payment();
                case 0 -> {
                    System.out.println("Exiting......");
                    System.exit(0);
                }

                default -> System.out.println("Invalid option");
            }
        }

    }

}
