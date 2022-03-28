package com.basicsstrong.behavioralPatterns.statePattern;

public class Manager implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Work : Design the project architecture for the organisation");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("Can Approve Leaves : Yes, manager can Approve leaves");
    }
}
