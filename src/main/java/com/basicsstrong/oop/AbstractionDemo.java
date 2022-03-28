package com.basicsstrong.oop;

import java.util.ArrayList;

//Abstraction with Interface
interface Mobile{

    public void calling(String number);
    public void sendMessage(String message);
}

class Apple implements Mobile{

    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContact(String number){
        contacts.add(number);
    }

    @Override
    public void calling(String number) {
        System.out.println("Calling..." + number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message..." + message);
    }
}

//Abstraction with Abstract class

abstract class Mobilee{

     ArrayList<String> list = new ArrayList<String>();
    abstract void calling(String number);
    abstract void sendMessage(String message);

    public void addContact(String contact){
        list.add(contact);
    }
}

class Samsung extends Mobilee{

    @Override
    void calling(String number) {
        System.out.println("Calling..." + number);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message..." + message);
    }
}

public class AbstractionDemo {

    public static void main( String[] args )
    {
       Apple myPhone = new Apple();
       myPhone.calling("12234");
       myPhone.sendMessage("Hello , how are you");
       myPhone.addContact("12234");

       Samsung samsung = new Samsung();
       samsung.calling("99999");
       samsung.sendMessage("Hola de nuevo");
       samsung.addContact("Diego");
    }
}



