package com.basicsstrong.creationaPatterns.singletonPattern;

public enum EnumSingleton {

    SINGLETON;

    int val;

    public static void doStuff(){
        System.out.println("This is ENUM Singleton");
    }
}
