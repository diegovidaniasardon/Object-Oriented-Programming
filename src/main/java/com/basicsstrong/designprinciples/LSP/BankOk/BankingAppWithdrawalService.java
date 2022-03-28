package com.basicsstrong.designprinciples.LSP.BankOk;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WithdrawableAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    public void withdraw(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }
    public void deposit(BigDecimal amount) {
        withdrawableAccount.deposit(amount);
    }

    public static void main(String[] args) {
        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal(1000.00));

        BankingAppWithdrawalService bankingAppWithdrawalService = new BankingAppWithdrawalService(new WithdrawableAccount());
        bankingAppWithdrawalService.withdrawableAccount.deposit(new BigDecimal(99999999.00));

        BankingAppWithdrawalService withdrawableAccount = new BankingAppWithdrawalService(new WithdrawableAccount());
        withdrawableAccount.withdraw(new BigDecimal(100000000.00));
        withdrawableAccount.deposit(new BigDecimal(100000000.00));
    }
}
