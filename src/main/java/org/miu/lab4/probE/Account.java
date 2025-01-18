package org.miu.lab4.probE;

public abstract class Account {
    public double balance;
    public String acctId;

    public Account(String acctId, double balance) {
        this.acctId = acctId;
        this.balance = balance;
    }
    public abstract String getAccountId();
    public abstract double getBalance();
    public abstract double computeUpdatedBalance();
}
