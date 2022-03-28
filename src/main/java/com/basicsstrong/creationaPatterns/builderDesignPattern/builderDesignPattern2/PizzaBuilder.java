package com.basicsstrong.creationaPatterns.builderDesignPattern.builderDesignPattern2;

/** "Abstract Builder" */
abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() { return pizza; }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}