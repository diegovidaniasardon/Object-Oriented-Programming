package com.basicsstrong.creationaPatterns.builderDesignPattern.builderDesignPattern2;

/** "ConcreteBuilder" */
class PicantePizzaBuilder extends PizzaBuilder {
    public PicantePizzaBuilder(){
        super.pizza = new Pizza();
    }
    public void buildMasa()   {
        pizza.setMasa("cocido");
    }
    public void buildSalsa()   {
        pizza.setSalsa("picante");
    }
    public void buildRelleno() {
        pizza.setRelleno("pimienta+salchichón");
    }
}
