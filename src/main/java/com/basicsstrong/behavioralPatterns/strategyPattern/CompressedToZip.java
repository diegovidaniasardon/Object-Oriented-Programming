package com.basicsstrong.behavioralPatterns.strategyPattern;

public class CompressedToZip implements Strategy{
    @Override
    public void compressFile(String fileName) {
        System.out.println(fileName + " cnverted to .zip file");
    }
}
