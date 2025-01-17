package org.miu.lab3.prob3;

public class Cylinder {
    private double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(double radius) {
        this.radius = radius;
    }

    public double computeVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}
