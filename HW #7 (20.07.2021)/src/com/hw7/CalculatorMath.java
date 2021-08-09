package com.hw7;

public class CalculatorMath extends Calculator {
    @Override
    public void addition(int a, int b) {
        super.addition(a, b);
    }

    @Override
    public void subtraction(int a, int b) {
        super.subtraction(a, b);
    }

    @Override
    public void multiplication(int a, int b) {
        super.multiplication(a, b);
    }

    @Override
    public void division(int a, int b) {
        super.division(a, b);
    }

    @Override
    public void percent(int a, int b) {
        super.percent(a, b);
    }

    public void exponentiation(int a, int b){
        int result = (int) Math.pow(a,b);
        System.out.println("The number a=" + a + " to the power of b=" + b + " equals " + result);
    }

    public void extraction(int a, int b) {
        double result = Math.pow(a, 1.0/b);
        System.out.printf("Extract from the number a=" + a + " to the power of b=" + b + " equals "
                + "%.2f", result);
    }

    public void sin(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nSine a°=" + a + " equals " + "%.4f", Math.sin(result));
    }

    public void cos(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nCosine a°=" + a + " equals " + "%.4f", Math.cos(result));
    }

    public void tan(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nTangent a°=" + a + " equals " + "%.4f", Math.tan(result));
    }

    public void cot(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nCotangent a°=" + a + " equals " + "%.4f", 1.0 / Math.tan(result));
    }

    public void log(int a) {
        double result = Math.log(a);
        System.out.printf("\nThe logarithm of the number a=" + a + " equals " + "%.3f", result);
    }

    public void exp(int a) {
        double result = Math.exp(a);
        System.out.printf("\nThe exponent of the number a=" + a + " equals " + "%.3f", result);
    }
}
