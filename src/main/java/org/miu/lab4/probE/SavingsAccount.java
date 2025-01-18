package org.miu.lab4.probE;

public class SavingsAccount extends Account{
    private final double interestRate;

    public SavingsAccount(String acctId, double interestRate, double startBalance) {
        super(acctId, startBalance);
        this.interestRate = interestRate;
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
        return balance + interestRate;
    }
}
