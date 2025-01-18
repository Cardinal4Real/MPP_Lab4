package org.miu.lab4.probC;

import java.time.LocalDate;

public abstract class Employee {
    private int empId;

    public Employee(int empId) {
        this.empId = empId;
    }
    public void print(){
        LocalDate now = LocalDate.now();
        this.calcCompensation(now.getMonthValue(), now.getYear()).print();
    }
    public final Paycheck calcCompensation(int month, int year){
        double grossPay=this.calcGrossPay(month,year);
        return new Paycheck(grossPay);
    }
    public abstract double calcGrossPay(int month, int yr);
}
