package com.basicsstrong.creationaPatterns.builderDesignPattern;

public class MobileConcreteBuilder extends MobileBuilder {
    @Override
    public void createMemory() {
        getMobile().setMemory("32 GB");
        System.out.println("Memory created and installed");
    }

    @Override
    public void createBattery() {
        getMobile().setBattery("4500 mAh");
        System.out.println("Battery created and installed");
    }

    @Override
    public void createWireless() {
        getMobile().setWireless("Wireless ready");
        System.out.println("Wireless created and installed");
    }

    @Override
    public void createScreen() {
        getMobile().setScreen("Screen ready");
        System.out.println("Screen created and installed");
    }

    @Override
    public void createMetalCase() {
        getMobile().setMetalCase("Metal Case Ready");
        System.out.println("Metal Case created and installed");
    }

}
