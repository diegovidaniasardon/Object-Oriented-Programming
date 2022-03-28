package com.basicsstrong.designprinciples.LSP.BankOk;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {

    @Override
    protected void deposit(BigDecimal amount) {
        System.out.println("FixedTermDepositAccount deposit");
    }

}