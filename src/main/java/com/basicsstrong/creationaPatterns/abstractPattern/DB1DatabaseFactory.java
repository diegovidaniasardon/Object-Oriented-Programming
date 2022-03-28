package com.basicsstrong.creationaPatterns.abstractPattern;

public class DB1DatabaseFactory extends DatabaseFactory{
    @Override
    public Database getDatabase(String dbType) {
        Database database = null;
        if("Oracle".equalsIgnoreCase(dbType))
            database = new Oracle();
        else if("MySql".equalsIgnoreCase(dbType))
            database = new MySql();
        else if("MsAccess".equalsIgnoreCase(dbType))
            database = new MsAccess();
        return database;
    }
}
