package org.miu.lab5.prob3;

public final class Rectangle implements ClosedCurve {
    private final double width;
    private final double length;

    public double computeArea() {
        double area = this.width * this.length;
        return area;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }
}

