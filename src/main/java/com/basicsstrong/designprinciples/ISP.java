package com.basicsstrong.designprinciples;

interface Worker{
     public void work();

    // public void sleep();
}

interface Sleep
{
    public void sleep();
}

class Human implements Worker,Sleep{

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
}
//Robot doesn't need sleep
class Robot implements Worker{

    @Override
    public void work() {

    }
}

public class ISP {

    public static void main( String[] args ){

    }
}
