package com.basicsstrong.creationaPatterns.abstractPattern;

public class AbstractFactoryDesigbPattern {

    public static void main( String[] args )
    {
        DatabaseFactory databaseFactory = null;
        Database database = null;

        databaseFactory = DatabaseFactory.createDatabaseFactory("DB1DatabaseFactory");
        database = databaseFactory.getDatabase("MySql");
        System.out.println(database.connect());

        database = databaseFactory.getDatabase("Oracle");
        System.out.println(database.connect());

        databaseFactory = DatabaseFactory.createDatabaseFactory("DB2DatabaseFactory");
        database = databaseFactory.getDatabase("MySql");
        System.out.println(database.connect());

        database = databaseFactory.getDatabase("Oracle");
        System.out.println(database.connect());
    }
}
