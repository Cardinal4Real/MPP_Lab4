package org.miu.lab4.probC;

public record Paycheck(double grossPay) {

    public void print(){
        System.out.println(getNetPay());
    }
    public double getNetPay(){
        return grossPay-Tax.FICA.getVal()-Tax.STATE.getVal()-Tax.LOCAL.getVal()-Tax.MEDICARE.getVal()-Tax.SSN.getVal();
    }
}
