package me.randomNumbers;

import java.lang.reflect.Array;
import java.util.Arrays;

class RandomNumbersMain {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1, 50);
        }

        printIntArray(array);
        System.out.println(maxEven(array));
        System.out.println(countSquareNumbers(array));
        System.out.println(getGeometricAverage(array));

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 10);
        System.out.println("Index of 10 in array: " + index);

        int[] randoArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.equals(randoArray, array));
    }

    public static double getGeometricAverage(int[] array){
        long multiplicationResult = 1;
        for (int n : array){
            multiplicationResult *= n;
        }
        return Math.pow(multiplicationResult, 1.0 / array.length);
    }

    public static int countSquareNumbers(int[] array){
        int sum = 0;
        for (int n : array) {
            if (Math.sqrt(n) == (int)Math.sqrt(n) ) {
                sum++;
            }
        }
        return sum;
    }

    public static int maxEven(int[] array){
        int maxEven = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 && array[i] > maxEven){
                maxEven = array[i];
            }
        }
        return maxEven;
    }

    public static int getRandomNumber(int min, int max){
        int random = (int)(Math.random() * (max - min) + min) + 1;
        return random;
    }

    public static void printIntArray(int[] array){
        for (int element : array ){
            System.out.println(element);
        }
    }

}