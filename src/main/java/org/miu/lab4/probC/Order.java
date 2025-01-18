package org.miu.lab4.probC;

import java.time.LocalDate;

public class Order {
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;
    private Commissioned commissioned;

    public Order(int orderNo, LocalDate date, double orderAmount, Commissioned commissioned) {
        this.orderNo = orderNo;
        this.orderDate = date;
        this.orderAmount = orderAmount;
        this.commissioned = commissioned;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public Commissioned getCommissioned() {
        return commissioned;
    }
}
