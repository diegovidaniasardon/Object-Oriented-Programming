package com.basicsstrong.designprinciples.LSP.BankBad;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    @Override
    protected void deposit(BigDecimal amount) {
        // Deposit into this account
    }


}