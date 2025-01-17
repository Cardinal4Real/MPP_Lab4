package org.miu.lab3.prob3;

import java.awt.*;

public class Circle extends Cylinder {
    public Circle(double radius) {
        super(radius);
    }

    public double computeArea(){
        return Math.PI * super.getRadius() * super.getRadius();
    }
}
