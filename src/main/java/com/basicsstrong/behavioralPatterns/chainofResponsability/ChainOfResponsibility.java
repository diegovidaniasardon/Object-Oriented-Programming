package com.basicsstrong.behavioralPatterns.chainofResponsability;

class Loan {
    private int amount;

    public Loan(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

abstract class LoanApproval {
    protected LoanApproval nextLoanApproval;

    public void setNextLoanApproval(LoanApproval nextLoanApproval) {

        this.nextLoanApproval = nextLoanApproval;
    }

    public abstract void approveLoan(Loan loan);
}

class Manager extends LoanApproval{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() <= 100000){
            System.out.println("Approved by manager.");
        }else{
            nextLoanApproval.approveLoan(loan);
        }
    }
}
class Director extends LoanApproval{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() <= 250000){
            System.out.println("Approved by Director.");
        }else{
            nextLoanApproval.approveLoan(loan);
        }
    }
}
class VicePresindent extends LoanApproval{
    @Override
    public void approveLoan(Loan loan) {
        System.out.println("Approved by VP");
    }
}

public class ChainOfResponsibility {

    public static void main( String[] args ){
       LoanApproval loanApprovalManager  = new Manager();
       LoanApproval loanApprovalDirector = new Director();
       LoanApproval loanApprovalVP = new VicePresindent();

       loanApprovalManager.setNextLoanApproval(loanApprovalDirector);
       loanApprovalDirector.setNextLoanApproval(loanApprovalVP);

       loanApprovalManager.approveLoan(new Loan(5000000));
    }
}
