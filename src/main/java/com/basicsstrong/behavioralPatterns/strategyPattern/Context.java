package com.basicsstrong.behavioralPatterns.strategyPattern;

public class Context {

    Strategy strategy;

    public void setCompressionStrategy(Strategy compressionStrategy){
        this.strategy = compressionStrategy;
    }

    public void generateFile(String file){
        strategy.compressFile(file);
    }
}
