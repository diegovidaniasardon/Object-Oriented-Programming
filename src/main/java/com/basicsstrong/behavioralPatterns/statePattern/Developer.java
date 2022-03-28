package com.basicsstrong.behavioralPatterns.statePattern;

public class Developer implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Work : Have to Complete the teas assigned by Manager");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("Can Approve leaves : Yes, Developer can approve the leaves");
    }
}
