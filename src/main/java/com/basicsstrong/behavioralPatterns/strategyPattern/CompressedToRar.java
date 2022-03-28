package com.basicsstrong.behavioralPatterns.strategyPattern;

public class CompressedToRar implements Strategy{
    @Override
    public void compressFile(String fileName) {
        System.out.println(fileName + " cnverted to .ra file");
    }
}
