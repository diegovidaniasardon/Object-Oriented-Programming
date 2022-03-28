package com.basicsstrong.creationaPatterns.factoryPattern;

public class DBMS implements Database{
    @Override
    public String connect() {
        return "Connection Successfull to DBMS";
    }
}
