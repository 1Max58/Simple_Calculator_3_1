package com.example.simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers to calculate sum, difference, product and a quotient.");

        System.out.print("First number: ");
        float firstNumber = input.nextFloat();

        System.out.print("Second number: ");
        float secondNumber = input.nextFloat();
        input.close();

        float sum = firstNumber + secondNumber;
        System.out.printf("%.2f + %.2f = %.2f%n", firstNumber, secondNumber, sum);

        float difference = firstNumber - secondNumber;
        System.out.printf("%.2f - %.2f = %.2f%n", firstNumber, secondNumber, difference);

        float product = firstNumber * secondNumber;
        System.out.printf("%.2f * %.2f = %.2f%n", firstNumber, secondNumber, product);

        float quotient;
        quotient = firstNumber / secondNumber;
        System.out.printf("%.2f / %.2f = %.2f%n", firstNumber, secondNumber, quotient);
    }
}
