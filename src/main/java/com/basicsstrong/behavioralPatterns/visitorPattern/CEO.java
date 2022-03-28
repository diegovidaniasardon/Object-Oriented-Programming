package com.basicsstrong.behavioralPatterns.visitorPattern;

public class CEO implements Visitor{
    private String ceoName;

    public CEO(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCeoName() {
        return ceoName;
    }

    @Override
    public void visit(Visitable visitable) {

        Employee employee = (Employee)visitable;

        employee.setPerformanceStatus("Good");

        System.out.println(
                employee.getName() + " - " + employee.getPerformanceStatus() + " - " + this.ceoName
        );

    }
}
