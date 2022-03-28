package com.basicsstrong.structuraldesignpattern.decoratorPattern;

interface Burger{
    public void makeBurger();
}

class PlainBurger implements Burger{

    @Override
    public void makeBurger() {
        System.out.println("Plain Burger is ready");
    }
}

abstract class BurgerDecorator extends PlainBurger{
    protected Burger burger;

    public BurgerDecorator(Burger burger){
        this.burger = burger;
    }
    public void makeBurger(){
        burger.makeBurger();
    }
}

class CheeseBurgerDecorator extends BurgerDecorator{

    public CheeseBurgerDecorator(Burger burger) {
        super(burger);
    }
    public void makeBurger(){
        burger.makeBurger();
        System.out.println(", cheese added");
    }
}

class BarbecueBurgerDecorator extends BurgerDecorator{

    public BarbecueBurgerDecorator(Burger burger) {
        super(burger);
    }
    public void makeBurger(){
        burger.makeBurger();
        System.out.println(", vegetables and cheese added");
    }
}

public class Client {

    public static void main( String[] args )
    {
        Burger burger = new PlainBurger();
        burger.makeBurger();

        new CheeseBurgerDecorator(burger).makeBurger();
        new BarbecueBurgerDecorator(burger).makeBurger();

    }
}
