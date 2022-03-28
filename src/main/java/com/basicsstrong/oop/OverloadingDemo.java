package com.basicsstrong.oop;

class Addition{
    public void sum(int a, int b){
        System.out.println("Sum is:" +(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("Sum is:" +(a+b+c));
    }

    public void sum(double a, double b){
        System.out.println("Sum is:" +(a+b));
    }
}

public class OverloadingDemo {

    public static void main( String[] args )
    {
        Addition add = new Addition();
        add.sum(10, 15,16);
        add.sum(10, 15);
        add.sum(10.12, 15.15);

    }
}
