package org.example.calculator;

public class Calculator {
    public static int calculate(int operand1, String operator, int operand2) {
        return ArithmeticOperator.arithmeticCalculate(operand1, operator, operand2);
    }
}
