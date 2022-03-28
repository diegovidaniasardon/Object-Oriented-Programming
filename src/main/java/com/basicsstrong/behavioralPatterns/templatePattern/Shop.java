package com.basicsstrong.behavioralPatterns.templatePattern;

public class Shop extends ProcessOrder{
    @Override
    public void selectProduct() {
        System.out.println("Select product Shop");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment product Shop");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver product Shop");
    }
}
