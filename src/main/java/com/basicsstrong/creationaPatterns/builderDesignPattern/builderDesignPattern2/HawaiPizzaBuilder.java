package com.basicsstrong.creationaPatterns.builderDesignPattern.builderDesignPattern2;

/** "ConcreteBuilder" */
class HawaiPizzaBuilder extends PizzaBuilder {
    public HawaiPizzaBuilder(){
        super.pizza = new Pizza();
    }
    public void buildMasa()   {
        pizza.setMasa("suave");
    }
    public void buildSalsa()   {
        pizza.setSalsa("dulce");
    }
    public void buildRelleno() {
        pizza.setRelleno("chorizo+alcachofas");
    }
}
