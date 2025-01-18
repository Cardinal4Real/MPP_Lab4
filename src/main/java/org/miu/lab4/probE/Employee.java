package org.miu.lab4.probE;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accountList=new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void addAccount(Account acct){
        accountList.add(acct);
    }
    public double computeUpdatedBalanceSum(){
        double sum = 0.0;
        for(Account acct : accountList){
            if(acct!=null){
                sum+=acct.computeUpdatedBalance();
            }
        }
        return sum;
    }
}
