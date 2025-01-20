package org.miu.lab5.prob2;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.setQuackBehavior(new Quack());
        this.setFlyBehavior(new FlyWithWings());
    }

    public void display() {
        System.out.println("  displaying");
    }
}
