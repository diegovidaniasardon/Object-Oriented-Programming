package com.basicsstrong.behavioralPatterns.observerPattern;

public interface SubjectLibrary {

    public void subscribeObserver(Observer observer);
    public void unsubscribeObserver(Observer observer);
    public void notifyObserver();
}
