package com.basicsstrong.structuraldesignpattern.bridgePattern;

public class ButterflyWallArt extends Template{
    @Override
    public void designWall() {
        System.out.println("Designing the wall with Butterfly wall art..");
        if(color!=null)
            color.pickColor();
    }
}
