package com.company;

public class Odmocnina implements BinOp2{


    @Override
    public double vypocitej2(double prvniOperand) {
        return Math.sqrt(prvniOperand);
    }
}
