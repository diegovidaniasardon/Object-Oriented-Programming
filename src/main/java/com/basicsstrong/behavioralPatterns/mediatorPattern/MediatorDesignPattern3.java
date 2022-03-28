package com.basicsstrong.behavioralPatterns.mediatorPattern;

import java.util.HashMap;
import java.util.Map;

//Mediator interface
interface IChatRoom
{
    public void sendMessage(String msg, String userId);

    void addUser(User1 user);
}
//Concrete Mediator
class ChatRoom implements IChatRoom {

    private Map<String, User1> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId)
    {
        User1 u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User1 user) {
        this.usersMap.put(user.getId(), user);
    }
}

//Colleague class
abstract class User1
{
    private IChatRoom mediator;

    private String id;
    private String name;

    public User1(IChatRoom room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

//Concrete Colleagues
class ChatUser extends User1 {

    public ChatUser(IChatRoom room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }

}

public class MediatorDesignPattern3
{
    public static void main(String[] args)
    {
        IChatRoom chatroom = new ChatRoom();

        User1 user1 = new ChatUser(chatroom,"1", "Alex");
        User1 user2 = new ChatUser(chatroom,"2", "Brian");
        User1 user3 = new ChatUser(chatroom,"3", "Charles");
        User1 user4 = new ChatUser(chatroom,"4", "David");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
    }
}