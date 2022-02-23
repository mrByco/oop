package me.randomNumbers;

class RandomNumbersMain {
    public static void main(String[] args){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = getRandomNumber(1, 50);
        }

        printIntArray(array);
        System.out.println(maxOdd(array));
        System.out.println(countSquareNumbers(array));
        System.out.println(getSpecialAverage(array));
    }

    public static double getSpecialAverage(int[] array){
        long multiplicationResult = 1;
        for (int n : array){
            multiplicationResult *= n;
        }
        return Math.pow(multiplicationResult, 1.0 / array.length);
    }

    public static int countSquareNumbers(int[] array){
        int sum = 0;
        for (int n : array) {
            if (Math.sqrt(n) % 1 == 0) {
                sum++;
            }
        }
        return sum;
    }

    public static int maxOdd(int[] array){
        int maxOdd = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 && array[i] > maxOdd){
                maxOdd = array[i];
            }
        }
        return maxOdd;
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