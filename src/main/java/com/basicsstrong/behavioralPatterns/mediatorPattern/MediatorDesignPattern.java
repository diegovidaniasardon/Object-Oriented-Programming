package com.basicsstrong.behavioralPatterns.mediatorPattern;

import java.util.ArrayList;
import java.util.List;
//User defines the abstract class holding a single reference to the Mediator
abstract  class User{
    protected Mediator mediator;
    protected String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

class UserImpl extends User{

    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending  message : " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Receive  message : " + message);
    }
}
//Mediator defines the interface the User objects use to communicate
interface Mediator{
    public void sendMessage(String message, User user);
    public void registerUser(User user);
}
//ConcreteMediator encapsulates the interaction logic between user objects
class MediatorImpl implements Mediator{

    private List<User> users;

    public MediatorImpl() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u:this.users){
            if(u !=user){
                u.receive(message);
            }
        }
    }

    @Override
    public void registerUser(User user) {
       this.users.add(user);
    }
}

public class MediatorDesignPattern {

    public static void main( String[] args ){
        //User communicate only through the Mediator
       Mediator mediator = new MediatorImpl();

       User shiva = new UserImpl(mediator, "Shiva");
       User diego = new UserImpl(mediator, "Diego");

       User vishnu = new UserImpl(mediator, "Vishnu");

        //mediator.registerUser(diego);
       mediator.registerUser(shiva);
       mediator.registerUser(vishnu);

       //Diego doesn't receive the message because is not register
       shiva.send("Hi Vishnu");

    }
}
