package com.basicsstrong.behavioralPatterns.chainofResponsability2;

public abstract class LeaveHandler {

    protected LeaveHandler superVisor;

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    public abstract String applyLeave(Leave leave);
}
