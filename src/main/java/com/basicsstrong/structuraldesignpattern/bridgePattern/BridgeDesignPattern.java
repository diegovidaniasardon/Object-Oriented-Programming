package com.basicsstrong.structuraldesignpattern.bridgePattern;

public class BridgeDesignPattern {

    public static void main( String[] args )
    {
        Template art1 = new ButterflyWallArt();
        Template art2 = new TreeWallArt();

        Color blue = new Blue();
        Color red = new Red();

        art1.setColor(blue);
        art1.designWall();

        art2.setColor(red);
        art2.designWall();
    }
}
