package com.basicsstrong.designprinciples.LSP.BankOk;

import java.math.BigDecimal;

public class WithdrawableAccount extends Account{
    @Override
    public void deposit(BigDecimal amount) {
        System.out.println("WithdrawableAccount deposit " + amount);
    }

    public void withdraw(BigDecimal amount) {
        System.out.println(amount);
    }
}
