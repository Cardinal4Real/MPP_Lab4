package org.miu.lab5.prob2;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.setQuackBehavior(new MuteQuack());
        this.setFlyBehavior(new CannotFly());
    }

    public void display() {
        System.out.println("  displaying");
    }
}
