package com.basicsstrong.behavioralPatterns.strategyPattern;

import java.lang.reflect.Constructor;

public class StrategyDesignPattern {

    public static void main( String[] args ) {
        Context context = new Context();

        context.setCompressionStrategy(new CompressedToRar());
        context.generateFile("Abc.text");
    }
}
