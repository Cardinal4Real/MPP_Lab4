package org.miu.lab5.prob2;

public class CannotFly implements FlyBehavior {
    public CannotFly() {
    }

    public void fly() {
        System.out.println("  cannot fly");
    }
}
