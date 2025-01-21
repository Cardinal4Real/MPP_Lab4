package org.miu.lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;

    Order(LocalDate orderDate) {
        this.orderDate = orderDate;
        this.items = new ArrayList();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String toString() {
        return this.orderDate + ": " + this.items.toString();
    }
}
