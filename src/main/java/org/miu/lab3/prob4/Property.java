package org.miu.lab3.prob4;

public abstract class Property {
    private Address address;
    public Property(Address address) {
        this.address = address;
    }

    public abstract double computeRent();
}
