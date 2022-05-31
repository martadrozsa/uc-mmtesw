package calculator;

import calculator.entities.*;

public class Program {


    public static void main(String[] args) {

        Operation operationSum = new Sum();
        System.out.println("Sum: " + operationSum.calculate(2, 8));

        Operation operationSub = new Subtraction();
        System.out.println("Subtraction: " + operationSub.calculate(14, 8));

        Operation operationMul = new Multiplication();
        System.out.println("Multiplication: " + operationMul.calculate(6, 6));

        Operation operationDiv = new Division();
        System.out.println("Division: " + operationDiv.calculate(15, 3));
    }
}