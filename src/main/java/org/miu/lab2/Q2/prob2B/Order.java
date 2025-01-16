package org.miu.lab2.Q2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLineList;

    public Order(int orderNum,int lineNum, float price, int quantity) {
        this.orderNum = orderNum;
        this.orderLineList = new ArrayList<>();
        addOrderLine(lineNum,price,quantity);
    }
    public void addOrderLine(int lineNum, float price, int quantity) {
        orderLineList.add(new OrderLine(this,lineNum,price,quantity));
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", orderLineList=" + orderLineList +
                '}';
    }
}