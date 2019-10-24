package com.lgs.lab.interface2;

public class Main {
    public static void main(String[] args) {
        MyCalculator calc=new MyCalculator();
        System.out.println(calc.plus(5,11));
        System.out.println(calc.minus(77,43));
        System.out.println(calc.devide(4326,38));
        System.out.println(calc.multiply(31,47));
    }
}
