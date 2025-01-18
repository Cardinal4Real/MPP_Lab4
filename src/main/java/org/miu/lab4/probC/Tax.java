package org.miu.lab4.probC;

public enum Tax {
    FICA(0.23),
    STATE(0.05),
    LOCAL(0.01),
    MEDICARE(0.03),
    SSN(0.075);

    private double val;
    Tax(double val) {
        this.val = val;
    }

    public double getVal() {
        return val;
    }
}
