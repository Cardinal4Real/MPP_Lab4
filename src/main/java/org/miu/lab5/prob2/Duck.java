package org.miu.lab5.prob2;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void fly() {
        this.flyBehavior.fly();
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    protected void setFlyBehavior(FlyBehavior b) {
        this.flyBehavior = b;
    }

    protected void setQuackBehavior(QuackBehavior b) {
        this.quackBehavior = b;
    }

    public void swim() {
        System.out.println("  swimming");
    }
}

