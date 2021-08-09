package com.hw7;

public class CalculatorEngineering extends CalculatorMath{

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
