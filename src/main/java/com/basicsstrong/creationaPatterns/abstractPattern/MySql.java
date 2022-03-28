package com.basicsstrong.creationaPatterns.abstractPattern;

public class MySql implements Database{
    @Override
    public String connect() {
        return "Connection Successfull with MySql DB.";
    }
}
