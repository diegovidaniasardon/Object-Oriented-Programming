package com.basicsstrong.behavioralPatterns.commanPattern;

interface ICommandAC{
    public void execute();
}

class AC{
    public void turnOn(){
        System.out.println("Ac is on");
    }
    public void turnOff(){
        System.out.println("Ac is off");
    }
    public void decTemp(){
        System.out.println("Decreasing temperature by 1");
    }
    public void incTemp(){
        System.out.println("Increasing temperature by 1");
    }
}

class StartACCommand implements ICommandAC{

    AC ac;
    public StartACCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning on the AC");
        ac.turnOn();
    }
}

class IncTempCommand implements ICommandAC{

    AC ac;
    public IncTempCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Increasing temperature");
        ac.incTemp();
    }
}

class DecTempCommand implements ICommandAC{
    AC ac;
    public DecTempCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Decreasing temperature");
        ac.decTemp();
    }
}
class StopACCommand implements ICommandAC{
    AC ac;
    public StopACCommand(AC ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turning off the AC");
        ac.turnOff();
    }
}
//INVOKER
class ACAutomationRemote{
    ICommandAC iCommandAC;

    public void setiCommandAC(ICommandAC iCommandAC) {
        this.iCommandAC = iCommandAC;
    }

    public void buttonPressed(){
        iCommandAC.execute();
    }
}


public class CommandDesignPattern {

    public static void main( String[] args ){
       AC acRoomOne = new AC();
       AC acRoomTwo = new AC();

       ACAutomationRemote remote = new ACAutomationRemote();

       remote.setiCommandAC(new StartACCommand(acRoomOne));
       remote.buttonPressed();
       remote.setiCommandAC(new StartACCommand(acRoomTwo));
       remote.buttonPressed();
       remote.setiCommandAC(new IncTempCommand(acRoomTwo));
       remote.buttonPressed();
    }
}
