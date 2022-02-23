package me.matyi;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startCalculationLoop();
    }

    public static void startCalculationLoop(){
        boolean doNextCalculation = true;
        while (doNextCalculation){
            executeCalculationLoop();
            doNextCalculation = askForContinue();
        }
    }

    public static void executeCalculationLoop(){
        System.out.println("Give me number A");
        int a = readNumber();

        System.out.println("Give me the operand");
        EOperand operand = readOperand();

        System.out.println("Give me number B");
        int b = readNumber();

        System.out.println(calculate(a, b, operand));
    }

    public static int readNumber(){
        int number = 0;
        while (!scanner.hasNextInt()){
            System.out.println("Give me a number");
            scanner.nextLine();
        }
        number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static EOperand readOperand() {
        EOperand operand = null;
        while (operand == null){
            String input = scanner.nextLine();
            switch (input) {
                case "+" -> operand = EOperand.add;
                case "-" -> operand = EOperand.subtract;
                case "*" -> operand = EOperand.multiply;
                case "/" -> operand = EOperand.divide;
                case "%" -> operand = EOperand.mod;
                default -> System.out.println("Please enter a valid operand ('+', '-', '*', '/', '%')");
            }
        }
        return operand;
    }

    public static double calculate(int a, int b, EOperand operand) throws IllegalStateException {
        switch (operand){
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
                return (double)a / b;
            }
            case mod -> {
                return a % b;
            }
        }
        throw new IllegalStateException("Unknown operand: " + operand);
    }

    public static boolean askForContinue(){
        while (true){
            System.out.println("Next calculation? (Y/n)");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("y") || answer.equals("n") || answer.equals("")){
                return !answer.equals("n");
            }
            System.out.println("Invalid answer");
        }
    }
}