package com.collections;

import java.util.*;

public class OrderService {

    Map<String, Product> orderDetailsMap = new HashMap<>();

    Map<Integer, Product> productsMap = new HashMap<>();

    Stack<String> actionHistory = new Stack<>();


    Queue<String> pendingOrders = new LinkedList<>();

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
        int productId = scanner.nextInt();

        //check all the id's from the product map
        if(productsMap.containsKey(productId)){
            Product product = productsMap.get(productId);

            //random order pattern using UUID
            String orderId = "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

            pendingOrders.add(orderId);
            actionHistory.push(orderId);
            orderDetailsMap.put(orderId, product);

            System.out.println("Order Placed successfully");
            System.out.println("Order ID   : " + orderId);
            System.out.println("Customer   : " + name);
            System.out.println("Product    : " + product.getProductName());
            System.out.println("Price      : ₹" + product.getProductPrice());
        }else {
            System.out.println("Product Id not found");
        }

    }

    void viewOrder(){

        Iterator<String> iterator = actionHistory.iterator();
        while (iterator.hasNext()){
            System.out.println("Pending items :: "+iterator.next());
        }

    }

    void processOrder(){

        String order = pendingOrders.peek();
        pendingOrders.poll();
        System.out.println("Order "+ order +" processed successfully.....");
        Iterator<String> iterator = pendingOrders.iterator();
        while (iterator.hasNext()){
            System.out.println("Pending Orders :: "+iterator.next());
        }

    }

    void undoLastAction(){
        if (!actionHistory.isEmpty()) {
            String lastAction = actionHistory.pop();

            System.out.println("↩️ Undone: " + lastAction);
        } else {
            System.out.println("No actions to undo.");
        }
    }


    void payment(){
        //orderid
        //order details
        //show price
        //payment success

        //create a map where it can hold orderid and order details
        //Map<String(order),Product(object)>
        String order = "#Ramana102";
        String[] orderBreak = order.split("-");

        String productId =orderBreak[orderBreak.length-1];
        System.out.println("Product id ::  "+productId);

        //parse the string into integer
        int prodId = Integer.parseInt(productId);

        Product product = productsMap.get(prodId);
        System.out.println("Payment for Product:: "+product.getProductName()+"  Price :: "+product.getProductPrice());
        System.out.println("Payment successfull");


    }

}
