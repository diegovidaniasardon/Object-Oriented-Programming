package com.basicsstrong.structuraldesignpattern.bridgePattern;

public class Blue implements Color{
    @Override
    public void pickColor() {
        System.out.println("Blue color is picked for the wall art");
    }
}
