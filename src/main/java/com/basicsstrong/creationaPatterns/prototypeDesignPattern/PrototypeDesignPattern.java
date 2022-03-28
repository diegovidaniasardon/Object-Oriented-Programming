package com.basicsstrong.creationaPatterns.prototypeDesignPattern;

public class PrototypeDesignPattern {

    public static void main( String[] args ) throws CloneNotSupportedException {
        CoffeeShop coffeeShop1 = new CoffeeShop();
        coffeeShop1.setShopName("CCD");
        coffeeShop1.loadStock();
        System.out.println(coffeeShop1);

        //without pattern
       /* CoffeeShop coffeeShop2 = new CoffeeShop();
        coffeeShop2.setShopName("AAB");
        coffeeShop2.loadStock();
        System.out.println(coffeeShop2);*/

        //with Prototype Patthern -  Cloneable
        //CoffeeShop coffeeShop2 = (CoffeeShop)coffeeShop1.clone();
        CoffeeShop coffeeShop2 = coffeeShop1.clone();
        coffeeShop2.setShopName("AAB");
        System.out.println(coffeeShop2);

    }
}
