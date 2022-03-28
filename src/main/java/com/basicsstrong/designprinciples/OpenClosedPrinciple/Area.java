package com.basicsstrong.designprinciples.OpenClosedPrinciple;

//OCP > Open Closed Principle - Software entities (classes, modules, functions, etc.) should be open for extension, but close for modification
abstract class Shape{
    abstract public void calculateArea();
}

class Rectangle extends Shape{
    double height;
    double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(this.height * this.width);
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(3.14 * this.radius);
    }
}

class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * this.base * this.height);
    }
}

class AreaCalculator{
    Object shape;
    public AreaCalculator(Object shape){
        this.shape = shape;
    }

    public void calculate(){
        if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.height*rectangle.width);
        }
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            System.out.println(3.14 * circle.radius);
        }
        if(shape instanceof Triangle){
           Triangle triangle = (Triangle) shape;
            System.out.println(0.5 * triangle.base * triangle.height);
        }

    }
}

class AreaCalculatorOCP{
    public void calculate(Shape shape){
        shape.calculateArea();
    }

}

public class Area {

    public static void main(String[] args) {
       AreaCalculator areaCalculatorRectangle = new AreaCalculator(new Rectangle(20,10));
        areaCalculatorRectangle.calculate();

        AreaCalculator areaCalculatorCircle = new AreaCalculator(new Circle(20));
        areaCalculatorCircle.calculate();

        AreaCalculatorOCP areaCalculatorOCP = new AreaCalculatorOCP();
        areaCalculatorOCP.calculate(new Rectangle(20,10));
        areaCalculatorOCP.calculate(new Circle(50));
    }

}
