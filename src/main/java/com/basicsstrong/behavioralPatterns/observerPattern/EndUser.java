package com.basicsstrong.behavioralPatterns.observerPattern;

public class EndUser implements Observer{
    String name;

    public EndUser(String name, SubjectLibrary subjectLibrary) {
        this.name = name;
        subjectLibrary.subscribeObserver(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String available) {
        System.out.println("Hello " + name + " is available");
    }
}
