package org.miu.lab4.probE;

public class CheckingAccount extends Account{
    private double monthlyFee;

    public CheckingAccount(String acctId, double fee, double startBalance) {
        super(acctId, startBalance);
        this.monthlyFee = fee;
    }

    @Override
    public String getAccountId() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
