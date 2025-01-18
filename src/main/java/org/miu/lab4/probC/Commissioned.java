package org.miu.lab4.probC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    private List<Order> orderList=new ArrayList<>();

    public Commissioned(int empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }
    public void addOrder(Order order) {
        orderList.add(order);
    }

    @Override
    public final double calcGrossPay(int month, int yr) {
        LocalDate firstDayOfMonth = LocalDate.of(yr, month, 1);
        double orderTotal=0;
        for(Order order : orderList) {
            if(isPrevMonth(firstDayOfMonth,order.getOrderDate())) {
                orderTotal+=order.getOrderAmount();
            }
        }
        return (commission*orderTotal)+orderTotal;
    }

    private boolean isPrevMonth(LocalDate firstDayOfMonth, LocalDate orderDate) {
        int currentMonth = firstDayOfMonth.getMonthValue();
        int currentYear = firstDayOfMonth.getYear();
        int previousMonth = orderDate.getMonthValue();
        int previousYear = orderDate.getYear();
        return currentMonth-previousMonth == 1 && currentYear == previousYear || currentMonth==1 && previousMonth == 12 && currentYear-previousYear==1;
    }
}
