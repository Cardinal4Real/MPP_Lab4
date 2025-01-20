package org.miu.lab5.prob3;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    private static List<ClosedCurve> list;

    public MainProgram() {
    }

    public static void main(String[] args) {
        list = new ArrayList();
        list.add(new Rectangle((double)10.0F, (double)12.0F));
        list.add(new Circle((double)12.0F));
        list.add(new Triangle((double)10.0F, (double)12.0F));
        double sum = (double)0.0F;

        for(int i = 0; i < list.size(); ++i) {
            sum += ((ClosedCurve)list.get(i)).computeArea();
        }

        System.out.printf("Sum of all areas: %.2f", sum);
    }
}

