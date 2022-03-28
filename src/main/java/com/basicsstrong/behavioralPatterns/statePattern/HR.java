package com.basicsstrong.behavioralPatterns.statePattern;

public class HR implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Work: Recruitment resources for Organisation");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("Can Approve Leaves : NO, HR cant approve the leaves");
    }
}
