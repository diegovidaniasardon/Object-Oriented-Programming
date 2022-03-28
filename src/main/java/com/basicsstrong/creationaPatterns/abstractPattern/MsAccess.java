package com.basicsstrong.creationaPatterns.abstractPattern;

public class MsAccess implements Database{
    @Override
    public String connect() {
        return "Connection Successfull with MsAccess DB.";
    }
}
