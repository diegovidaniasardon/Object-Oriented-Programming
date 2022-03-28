package com.basicsstrong.oop;

class Account{

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    };
}

public class EncapsulationDemo {

    public static void main( String[] args )
    {
            Account account = new Account();
            account.setBalance(10.0);
            System.out.println(account.getBalance());

    }
}
