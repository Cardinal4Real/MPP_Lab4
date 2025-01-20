package org.miu.lab5.prob3;

public final class Circle implements ClosedCurve {
    private final double radius;

    public double computeArea() {
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getradius() {
        return this.radius;
    }
}

