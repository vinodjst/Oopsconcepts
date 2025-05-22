package com.collections;

import java.util.*;

public class OrderService {


    Map<Integer, Product> productsMap = new HashMap<>();



    Map<String, String> order = new HashMap<>();


    void dataSetup(){

        productsMap.put(101,new Product(101,"iphone","1000000"));
        productsMap.put(102,new Product(102,"powerbank","7000"));
        productsMap.put(103,new Product(103,"tv","30000"));
        productsMap.put(104,new Product(104,"pc","40000"));
    }

    void addProduct(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Id :");
        int productId = scanner.nextInt();

        System.out.println("Enter Product Name :");
        String productName = scanner.next();

        scanner.nextLine();

        System.out.println("Enter Product Price :");
        String productPrice = scanner.next();

        Product product = new Product(productId, productName, productPrice);

        productsMap.put(productId,product);

        System.out.println("Product added successfully");

    }


    void viewProducts(){

        Iterator<Map.Entry<Integer, Product>> iterator = productsMap.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry<Integer, Product> productMap = iterator.next();
            System.out.println(productMap.getKey()+" -:::- "+productMap.getValue());
        }
    }

    void placeOrder(){
        //show products to the customers --done
        // cust can choose the product
        //we place the otder with customer name ,product details along with random order id
        viewProducts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Please enter product Id :");
        String productId = scanner.next();

        String orderId = "#"+name+productId;

        order.put(orderId,name+","+productId);

        System.out.println("Order Placed successfully");
    }

    void viewOrder(){


        Iterator<Map.Entry<String, String>> iterator = order.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry<String, String> orderMap = iterator.next();
            System.out.println("Order Id :: "+orderMap.getKey()+"  Order Info(CustomerName,Product Id) ::"+orderMap.getValue());
        }
    }

    void viewCustomer(){

        System.out.println("view customer");
    }

    void undoLastAction(){
        System.out.println("removed");
    }


}
