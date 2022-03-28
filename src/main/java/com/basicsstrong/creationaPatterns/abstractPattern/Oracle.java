package com.basicsstrong.creationaPatterns.abstractPattern;

public class Oracle implements Database{
    @Override
    public String connect() {
        return "Connection Successfull with Oracle DB.";
    }
}
