package com.basicsstrong.creationaPatterns.builderDesignPattern;

//Director
public class Manufacturer {

public static Mobile createCompleteObject(){

    MobileBuilder mobileBuilder = new MobileConcreteBuilder();
    return mobileBuilder.buildMobile();
}

}
