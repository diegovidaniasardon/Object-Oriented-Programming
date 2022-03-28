package com.basicsstrong.behavioralPatterns.observerPattern;


import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDesignPattern {

    public static void main( String[] args ) {
        Book book = new Book("Book1", "Horror", "Xxy", 200, "SoldOut");

        EndUser user1 = new EndUser("Diego", book);
        EndUser user2 = new EndUser("Luis", book);

        ArrayList<Observer> subscribers = book.getObserversList();
        for (Iterator<Observer> iterator = subscribers.iterator(); ((Iterator<?>) iterator).hasNext(); ) {
            EndUser endUser = (EndUser)iterator.next();
            System.out.println(endUser.getName() + " has subscribe for " + book.getName() + " Book");
        }

        System.out.println(book.getInStock());
        System.out.println("Book is now available");

        book.setInStock("Back in stock");
    }
}
