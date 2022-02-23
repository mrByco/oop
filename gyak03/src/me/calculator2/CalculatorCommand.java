package me.calculator2;

import me.EOperand;

public class CalculatorCommand {
    int a;
    int b;
    EOperand operand;

    public CalculatorCommand(int a, int b, EOperand operand) {
        this.a = a;
        this.b = b;
        this.operand = operand;
    }

    public double getResult() {
        switch (operand) {
            case multiply -> {
                return a * b;
            }
            case add -> {
                return a + b;
            }
            case subtract -> {
                return a - b;
            }
            case divide -> {
                return (double) a / b;
            }
            case mod -> {
                return a % b;
            }
        }
        throw new IllegalStateException("Unknown operand: " + operand);
    }
}
