package com.basicsstrong.creationaPatterns.abstractPattern;

public abstract class DatabaseFactory {
    public abstract Database getDatabase(String type);

    public static DatabaseFactory createDatabaseFactory(String factoryType){
        if("DB1DatabaseFactory".equalsIgnoreCase(factoryType))
            return new DB1DatabaseFactory();
        else
            return new DB2DatabaseFactory();
    }
}
