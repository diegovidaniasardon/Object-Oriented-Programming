package com.basicsstrong.designprinciples.LSP.BankBad;

import com.basicsstrong.designprinciples.LSP.BankOk.WithdrawableAccount;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private Account account;
    private WithdrawableAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }

    public void withdraw(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }



    public static void main(String[] args) {
        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal(1000.00));

        BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(new WithdrawableAccount());
        withdrawalService.withdraw(new BigDecimal(10000000000000.00));

    }
}
