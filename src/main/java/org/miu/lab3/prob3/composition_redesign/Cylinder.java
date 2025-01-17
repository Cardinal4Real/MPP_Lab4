package org.miu.lab3.prob3.composition_redesign;

public class Cylinder {
    private Circle base;
    public double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public double computeVolume() {
        return base.computeArea() * height;
    }

    public double getHeight() {
        return height;
    }
}
