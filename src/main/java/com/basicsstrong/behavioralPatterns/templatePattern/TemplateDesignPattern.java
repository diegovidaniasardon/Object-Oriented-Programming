package com.basicsstrong.behavioralPatterns.templatePattern;

public class TemplateDesignPattern {

    public static void main( String[] args ) {

        ProcessOrder processOrder = new Shop();
        processOrder.doShopping();

        ProcessOrder processOrder1 = new Flipkart();
        processOrder1.doShopping();
    }
}
