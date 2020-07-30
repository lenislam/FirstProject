package oop.polymorphism.methodoverloading;

import oop.polymorphism.methodoverloading.Calculator;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.doSummation(39,76);
        calculator.doSummation(59,45,80);
        calculator.doSummation("Mujahid",47,35 );
    }

}
