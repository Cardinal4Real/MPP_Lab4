package org.miu.lab5.prob4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    Customer(String name) {
        this.name = name;
        this.orders = new ArrayList();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public String getName() {
        return this.name;
    }

    public List<Order> getOrders() {
        return this.orders;
    }
}
