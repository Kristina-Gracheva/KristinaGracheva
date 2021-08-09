package com.hw7;

public class CalculatorEngineering extends CalculatorMath{

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

    @Override
    public void exponentiation(int a, int b) {
        super.exponentiation(a, b);
    }

    @Override
    public void extraction(int a, int b) {
        super.extraction(a, b);
    }

    @Override
    public void sin(int a) {
        super.sin(a);
    }

    @Override
    public void cos(int a) {
        super.cos(a);
    }

    @Override
    public void tan(int a) {
        super.tan(a);
    }

    @Override
    public void cot(int a) {
        super.cot(a);
    }

    @Override
    public void log(int a) {
        super.log(a);
    }

    @Override
    public void exp(int a) {
        super.exp(a);
    }

    public void factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println("The factorial of the number a=" + a + " equals " + result);
    }


    public void asin(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nArcsine a°=" + a + " equals " + "%.4f", Math.asin(result));
    }

    public void acos(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nArccosine a°=" + a + " equals " + "%.4f", Math.acos(result));
    }

    public void atan(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nArctangent a°=" + a + " equals " + "%.4f", Math.atan(result));
    }

    public void acot(int a) {
        double result = Math.toRadians(a);
        System.out.printf("\nArccotangent a°=" + a + " equals " + "%.4f", (Math.atan(-result) + (Math.PI / 2)));
    }

    public void mod(int a, int b) {
        int result = a % b;
        System.out.println("\nThe remainder of dividing number a=" + a + " by number b=" + b +
                " equals " + result);
    }
}
