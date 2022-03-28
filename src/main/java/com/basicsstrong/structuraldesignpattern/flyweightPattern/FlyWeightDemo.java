package com.basicsstrong.structuraldesignpattern.flyweightPattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

class Product {
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Order{
     private final int orderNumber;
     private final Product product;

    public Order(int orderNumber, Product product) {
        this.orderNumber = orderNumber;
        this.product = product;
    }
    void processOrder(){
        System.out.println(
                "Ordering " + product +
                        " for order number " + orderNumber
        );
    }
}
class Portfolio{
    private Map<String, Product> products = new HashMap<String, Product>();

    public Product lookup(String productName){
        if(!products.containsKey(productName))
            products.put(productName, new Product(productName));
        return products.get(productName);
    }
    public int totalProductsMade(){
        return products.size();
    }
}

class Bucket{
    private final Portfolio portfolio = new Portfolio();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();
    void executeOrder(String productName, int orderNumber){
        Product product = portfolio.lookup(productName);
        Order order = new Order(orderNumber, product);
        orders.add(order);
    }
    void process(){
        for(Order order : orders){
            order.processOrder();
            orders.remove(order);
        }
    }
    int getTotalProducts(){
        return portfolio.totalProductsMade();
    }
}

public class FlyWeightDemo {
    public static void main( String[] args )
    {
        Bucket bucket = new Bucket();
        bucket.executeOrder("Macbook pro" ,12);
        bucket.executeOrder("Samsung mobile" ,11);
        bucket.executeOrder("Smart TV" ,7);
        bucket.executeOrder("Washing Machine" ,5);
        bucket.process();
        System.out.println(bucket.getTotalProducts());
    }
}
