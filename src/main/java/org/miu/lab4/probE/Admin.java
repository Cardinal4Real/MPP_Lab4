package org.miu.lab4.probE;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> employees) {
        double sum = 0.0;
        for (Employee employee : employees) {
            if(employee!=null){
                sum+=employee.computeUpdatedBalanceSum();
            }
        }
        return sum;
    }
}
