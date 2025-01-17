package org.miu.lab3.prob3.composition_redesign;

import org.miu.lab3.prob3.Cylinder;

public class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
