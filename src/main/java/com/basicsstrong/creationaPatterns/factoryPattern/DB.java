package com.basicsstrong.creationaPatterns.factoryPattern;

public class DB {

    private String properties;
    private static final String p1 = "RDBMS Properties";
    private static final String p2 = "DBMS Properties";

    private DB(String type)
    {

        this.properties = type;
    }

    public static DB getRDBMS(){

        return new DB(p1);
    }

    public static DB getDBMS(){

        return new DB(p2);
    }
}
