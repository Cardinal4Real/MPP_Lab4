package org.miu.lab5.prob2;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.setQuackBehavior(new Squeak());
        this.setFlyBehavior(new CannotFly());
    }

    public void display() {
        System.out.println("  displaying");
    }
}

