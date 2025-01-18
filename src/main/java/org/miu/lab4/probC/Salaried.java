package org.miu.lab4.probC;

public class Salaried extends Employee{
    private int salary;

    public Salaried(int empId, int salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int yr) {
        return salary;
    }
}
