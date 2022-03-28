package com.basicsstrong.behavioralPatterns.visitorPattern;

public class Employee implements Visitable{
    private String name;
    private String performanceStatus;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPerformanceStatus() {
        return performanceStatus;
    }

    public void setPerformanceStatus(String performanceStatus) {
        this.performanceStatus = performanceStatus;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
