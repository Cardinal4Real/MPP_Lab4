package org.miu.lab5.prob2;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.setQuackBehavior(new Quack());
        this.setFlyBehavior(new FlyWithWings());
    }

    public void display() {
        System.out.println("  displaying");
    }
}
