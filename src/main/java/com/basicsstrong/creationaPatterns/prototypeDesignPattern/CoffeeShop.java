package com.basicsstrong.creationaPatterns.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements Cloneable{
    String shopName;
    List<Coffee> coffeeTypes = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Coffee> getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(List<Coffee> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    @Override
    public String toString() {
        return "CoffeeShop{" +
                "shopName='" + shopName + '\'' +
                ", coffeeTypes=" + coffeeTypes +
                '}';
    }

    public void loadStock(){
        for(int i=0;i<=2;i++){
            Coffee coffee = new Coffee();
            coffee.setCoffeeId(i);
            coffee.setCoffeeName("CoffeeName"+i);
            getCoffeeTypes().add(coffee);
        }
    }

 /*   @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
*/
    @Override
    protected CoffeeShop clone() throws CloneNotSupportedException {
        CoffeeShop coffeeShop = new CoffeeShop();
        for(Coffee c : this.getCoffeeTypes()){
            coffeeShop.getCoffeeTypes().add(c);
        }
        return coffeeShop;
    }
}
