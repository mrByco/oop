package me.equasion;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] eq = readEquation();
        printEquationResult(solveEquation(eq[0], eq[1], eq[2]));
    }

    public static void printEquationResult(double[] array){
        if (array[2] > 0){
            System.out.println("Two solution: " + array[0] + " and " + array[1]);
        }
        else if (array[2] == 0){
            System.out.println("There is a single solution: " + array[0]);
        }
        else {
            System.out.println("There are only imaginary solutions for the equation!");
        }
    }

    //Returns the result in a double array: [x1, x2, discriminant]
    public static double[] solveEquation(int a, int b, int c){
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double x1 = Double.NaN;
        double x2 = Double.NaN;
        if (discriminant >= 0){
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            if (discriminant > 0) x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        return new double[]{x1, x2, discriminant};
    }

    public static int[] readEquation(){
        int[] polynomial = null;
        while (true){
            System.out.println("Enter the numbers of the equation (a<x^2> b<x> c)");
            String input = scanner.nextLine();
            try {
                String[] segments = input.split(" ");
                polynomial = new int[segments.length];
                for (int i = 0; i < segments.length; i++){
                    polynomial[i] = Integer.parseInt(segments[i]);
                }
                if (polynomial.length == 3){
                    return polynomial;
                }
            }
            catch (Exception e){
                System.out.println("Please enter numbers, separated by spaces!");
                continue;
            }
            System.out.println("Invalid input");
        }
    }
}
