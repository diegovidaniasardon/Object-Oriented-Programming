package com.basicsstrong.behavioralPatterns.observerPattern;

import java.util.ArrayList;


public class Book implements SubjectLibrary{

    private String name;
    private String type;
    private String author;
    private double price;
    private String inStock;
    private ArrayList<Observer> observersList = new ArrayList<Observer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed from Sold out to Back in stock \n");
        notifyObserver();
    }

    public ArrayList<Observer> getObserversList() {
        return observersList;
    }

    public void setObserversList(ArrayList<Observer> observersList) {
        this.observersList = observersList;
    }

    public Book(String name, String type, String author, double price, String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;

    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", inStock='" + inStock + '\'' +
                ", observersList=" + observersList +
                '}';
    }

    @Override
    public void subscribeObserver(Observer observer) {
         observersList.add(observer);
    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObserver() {
       System.out.println(
               "Book{" +
                       "name='" + this.name + '\'' +
                       ", type='" + this.type + '\'' +
                       ", author='" + this.author + '\'' +
                       ", price=" + this.price +
                       ", inStock='" + this.inStock + '\'' +
                       ", observersList=" + this.observersList +
                       '}'
       );

       for(Observer o: observersList)
       {
           o.update(this.inStock);
       }
    }
}
