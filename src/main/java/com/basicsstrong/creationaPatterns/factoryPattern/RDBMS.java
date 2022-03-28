package com.basicsstrong.creationaPatterns.factoryPattern;



public class RDBMS implements Database {

    @Override
    public String connect(){
      return "Connection Successfull to RDBMS";
    }
}
