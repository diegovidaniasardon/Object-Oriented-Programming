package com.basicsstrong.creationaPatterns.singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonDesignPattern {

    public static void main( String[] args ) throws Exception {
        EagerSingleton object = EagerSingleton.getInstance();

        saveToFile(object, "myFile.bin");
        object.setVal(20);

        EagerSingleton object2 = readFile("myFile.bin");

        System.out.println(object.getVal());
        System.out.println(object2.getVal());

        Constructor constructor = object.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        EagerSingleton object3 = (EagerSingleton) constructor.newInstance();

        if(object == object3){
            System.out.println("Both are same");
        }else
            System.out.println("Both are different");

        EnumSingleton enumSingleton = EnumSingleton.SINGLETON;
        enumSingleton.doStuff();
    }

    static void saveToFile(EagerSingleton singleton, String name) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(name);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){

           objectOutputStream.writeObject(singleton);
        }
    }

    static EagerSingleton readFile(String file) throws IOException, ClassNotFoundException {
        try(FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
           return (EagerSingleton )objectInputStream.readObject();
        }
    }
}
