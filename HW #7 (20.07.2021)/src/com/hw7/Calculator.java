package com.hw7;

public class Calculator {
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of number a=" + a + " and number b=" + b + " equals " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("The subtraction of number a=" + a + " and number b=" + b + " equals " + result);
    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of number a=" + a + " and number b=" + b + " equals " + result);
    }

    public void division(int a, int b) {
        double result = a / b * 1.0;
        System.out.printf("The division of number a=" + a +" and number b=" + b + " equals " + "%.2f", result);
    }

    public void percent(int a, int b) {
        double result = (a * b) / 100.0;
        System.out.printf("\nThe percent of number a=" + a +" and number b=" + b + " equals " + "%.2f", result);
        System.out.println("\n");
    }
}
