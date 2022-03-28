package com.basicsstrong.structuraldesignpattern.bridgePattern;

public abstract class Template {

    protected Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public void designWall();
}
