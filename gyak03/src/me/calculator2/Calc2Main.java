package me.calculator2;

import me.EOperand;

import java.text.ParseException;
import java.util.Scanner;

public class Calc2Main {

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
        CalculatorCommand command = readCommand();
        System.out.println(command.getResult());
    }

    public static CalculatorCommand readCommand(){
        CalculatorCommand command = null;
        while (command == null){
            System.out.println("Give me a calculation ('54+8')");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            try {
                int a = Integer.parseInt(parts[0]);
                EOperand operand = parseOperand(parts[1]);
                int b = Integer.parseInt(parts[2]);
                command = new CalculatorCommand(a, b, operand);
            }
            catch (Exception e){
                System.out.println("Invalid expression!");
            }
        }
        return command;
    }

    public static EOperand parseOperand(String input) throws ParseException {
        EOperand operand;
        switch (input) {
            case "+" -> operand = EOperand.add;
            case "-" -> operand = EOperand.subtract;
            case "*" -> operand = EOperand.multiply;
            case "/" -> operand = EOperand.divide;
            case "%" -> operand = EOperand.mod;
            default -> throw new ParseException("Uknown operand error: " + input, 0);
        }
        return operand;
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
