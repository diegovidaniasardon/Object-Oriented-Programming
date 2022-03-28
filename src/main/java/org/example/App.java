package org.example;

class Fan{
    //instance variable
    public boolean isOn;
    public static int staticVar;

    public void get(){
        staticVar++;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Fan is spinning");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Fan is stop");
    }

    public void checkFanStatus(){
        if(isOn)
            System.out.println("Fan is On!");
        else
            System.out.println("Fan is Off!");
    }
}

//Constructor
class Demo{

    private int a;

    //non-parameterised
    public Demo(){
        a = 10;
    }

    //parameterised
    public Demo(int a){
        this.a = a;
    }

    public void get(){
        System.out.println("Value of a = " + a);
    }
}


public class App
{
    public static void main( String[] args )
    {
        Fan myFan1 = new Fan();
        Fan myFan2 = new Fan();
        myFan1.turnOn();
        myFan1.checkFanStatus();
        myFan2.turnOff();
        myFan2.checkFanStatus();
        System.out.println(myFan1.isOn);

        //System.out.println(Fan.staticVar);
        //System.out.println(myFan1.staticVar);

        myFan1.get();
        System.out.println(myFan2.staticVar);

        //Demo d = new Demo();
        //d.get();
        Demo demo = new Demo(15);
        demo.get();
    }
}
