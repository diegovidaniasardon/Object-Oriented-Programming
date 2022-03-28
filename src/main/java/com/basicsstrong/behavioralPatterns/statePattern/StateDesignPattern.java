package com.basicsstrong.behavioralPatterns.statePattern;

public class StateDesignPattern {
    public static void main( String[] args ) {
        Employee employeeHR = new Employee("HR");
        employeeHR.working();

        Employee employeeManager = new Employee("Manager");
        employeeManager.working();
        employeeManager.authorities();
    }
}
