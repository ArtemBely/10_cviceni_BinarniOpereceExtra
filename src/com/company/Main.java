package com.company;

public class Main {

    public static void main(String[] args) {
                // BinarniOperace operace = new Nasobeni();
                //double vypocet = operace.vypocitej(10, 2);
                //System.out.println(vypocet);
                System.out.println(vypocitej(10, 2, new Scitani()));
                System.out.println(vypocitej(10, 2, new Nasobeni()));


                // doplnit implementaci binární operace
                System.out.println(vypocitej(10, 2, new Deleni()));
                System.out.println(vypocitej(10, 2, new Odcitani()));
                System.out.println(vypocitej(10, 2, new Mocnina()));
                System.out.println(vypocitej2(100, new Odmocnina()));
                System.out.println(vypocitej(27, 3, new LibovolnaOdmocnina()));
    }
    public static double vypocitej(double prvni, double druhy, BinarniOperace operace) {
        return operace.vypocitej(prvni, druhy);
    }
    public static double vypocitej2(double prvni, BinOp2 operace) {
        return operace.vypocitej2(prvni);
    }  // --> specialne pro odmocniny (1 exponent)
}
