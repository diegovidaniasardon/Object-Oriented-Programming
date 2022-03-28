package com.basicsstrong.designprinciples.LSP.BankOk;

import java.math.BigDecimal;

public abstract class Account {
    protected abstract void deposit(BigDecimal amount);

}