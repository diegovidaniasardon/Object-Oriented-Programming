package com.basicsstrong.behavioralPatterns.templatePattern;

public class Flipkart extends ProcessOrder{
    @Override
    public void selectProduct() {
        System.out.println("Select product Flipkart");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment product Flipkart");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver product Flipkart");
    }
}
