package com.basicsstrong.behavioralPatterns.iteratorPattern;

import java.util.*;

public class IteratorDesignPattern {

    public static void main( String[] args ) {

        List<String> list = new ArrayList<String>();

        list.add("Tom");
        list.add("John");
        list.add("Rohn");
        list.add("Shiva");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("Name :" + iterator.next());
        }
        System.out.println("Concrete Iterator we get is:" + iterator.toString());

        Set<String> set = new HashSet<>();
        set.add("Tom set");
        set.add("John set");
        set.add("Rohn set");
        set.add("Rohn set");

        Iterator<String> setIterator = set.iterator();
        while(setIterator.hasNext()){
            System.out.println("Name :" + setIterator.next());
        }
        System.out.println("Concrete Iterator we get is:" + setIterator.toString());

    }
}
