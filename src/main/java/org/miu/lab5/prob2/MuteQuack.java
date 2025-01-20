package org.miu.lab5.prob2;

public class MuteQuack implements QuackBehavior {
    public MuteQuack() {
    }

    public void quack() {
        System.out.println("  cannot quack");
    }
}

