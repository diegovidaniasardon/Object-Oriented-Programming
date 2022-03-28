package com.basicsstrong.creationaPatterns.factoryPattern.factoryPattern2;

//We're going to create a Shape interface and concrete classes implementing the Shape interface.
// A factory class ShapeFactory is defined as a next step.
//FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object.
// It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
