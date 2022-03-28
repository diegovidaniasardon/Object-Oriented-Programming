package com.basicsstrong.behavioralPatterns.mementoPattern;

import java.util.ArrayList;
import java.util.List;

class Refrigerator{

    private int price;
    private int volume;
    private boolean isPowerSaver;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerSaver() {
        return isPowerSaver;
    }

    public void setPowerSaver(boolean powerSaver) {
        isPowerSaver = powerSaver;
    }

    public Refrigerator(int price, int volume, boolean isPowerSaver) {
        this.price = price;
        this.volume = volume;
        this.isPowerSaver = isPowerSaver;
    }

    @Override
    public String toString() {
        return "Refrigetator{" +
                "price=" + price +
                ", volume=" + volume +
                ", isPowerSaver=" + isPowerSaver +
                '}';
    }
}

class Memento{
    Refrigerator refrigerator;

    public Memento(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "refrigerator=" + refrigerator +
                '}';
    }
}

class LivingAreaOriginator{
    Refrigerator refrigerator;

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigetator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Memento createMemento(){
        return new Memento(refrigerator);
    }

    public void getMemento(Memento memento){
        refrigerator = memento.getRefrigerator();
    }

    @Override
    public String toString() {
        return "LivingAreaOriginator{" +
                "refrigerator=" + refrigerator +
                '}';
    }
}

class CareTakerStore{
    List<Memento> refrigeratorList = new ArrayList<Memento>();

    public void addMemento(Memento memento){
        refrigeratorList.add(memento);
    }

    public Memento getMemento(int index){
        return refrigeratorList.get(index);
    }
}

public class MementoDesignPattern {

    public static void main( String[] args )
    {
       LivingAreaOriginator originator = new LivingAreaOriginator();

       CareTakerStore careTakerStore = new CareTakerStore();

       originator.setRefrigetator(new Refrigerator(1500, 15, false));
       careTakerStore.addMemento(originator.createMemento());

        originator.setRefrigetator(new Refrigerator(3000, 30, true));
        careTakerStore.addMemento(originator.createMemento());

        System.out.println("Current state of originator: " + originator.toString());

        System.out.println("Restoring the old one");

        originator.getMemento(careTakerStore.getMemento(0));
        System.out.println("Current state, after restoring: " + originator.toString());
    }
}
