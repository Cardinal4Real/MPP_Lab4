package org.miu.lab4.probC;

import java.time.LocalDate;

public class Hourly extends Employee{
    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly(int empId, double hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int yr) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
