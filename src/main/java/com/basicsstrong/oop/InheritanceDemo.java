package com.basicsstrong.oop;

public class InheritanceDemo {

    //Single inheritance
    //parent
    class A{

    }
    //child
    class B extends A{

    }

    //Multilevel inheritance
    class C extends B{

    }
    //Multiple inheritance // it's not allowed because the class can extend classes with the same method
    //More than 1 parent
    class D{}
    class DD{ }
   // class MM extends D, DD{} // ERROR

    //Hierarchical inheritance A -> B, BB single parent, more then 1 childrel
    class E{}
    class MM extends E{}
    class NN extends E{}

    //Hybrid  inheritance = Multiple + Multilevel inheritance > Not allowed in Java



    public static void main( String[] args )
    {

    }
}
