package org.miu.lab5.prob3;

public final class Triangle implements ClosedCurve {
    private final double base;
    private final double height;

    public double computeArea() {
        double area = (double)0.0F * this.base * this.height;
        return area;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }
}

