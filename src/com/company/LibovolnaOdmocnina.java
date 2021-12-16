package com.company;

public class LibovolnaOdmocnina implements BinarniOperace {

    @Override
    public double vypocitej(double prvniOperand, double druhyOperand) {
        return Math.pow(prvniOperand, 1.0 / druhyOperand);
    }

    // --> druhyOperand - mira
    // --> prvniOperand - cislo

}
