package com.basicsstrong.structuraldesignpattern.bridgePattern;

public class Red implements Color{
    @Override
    public void pickColor() {
        System.out.println("Red color is picked for the wall art");
    }
}
