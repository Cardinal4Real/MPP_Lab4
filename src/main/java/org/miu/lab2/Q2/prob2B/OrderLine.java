package org.miu.lab2.Q2.prob2B;

public class OrderLine {
    private int lineNum;
    private double price;
    private int quantity;
    private Order order;

    public OrderLine(Order order, int lineNum, double price, int quantity) {
        this.order = order;
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "lineNum=" + lineNum +
                ", price=" + price +
                ", quantity=" + quantity +
                ", order=" + order +
                '}';
    }
}
