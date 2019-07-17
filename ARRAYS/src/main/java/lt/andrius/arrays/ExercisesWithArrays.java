package lt.andrius.arrays;

import java.util.Arrays;
import java.util.Random;

public class ExercisesWithArrays {

    static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    static int getSum(int[] array) {
        int sumOfArrayNumbers = 0;
        for(int i = 0; i < array.length; i++) {
            sumOfArrayNumbers += array[i];
        }
        return sumOfArrayNumbers;
    }

    static void printAllPrimeNumbers(int[] array) {
        for(int i = 0; i < array.length; i++) {
            boolean numberIsPrime = determineNumberIsPrime(array[i]);
            if (numberIsPrime == true){
                System.out.println("Index: " + i + ", number: " + array[i] + " is prime");
            }
        }
    }

    static void printFirstPrimeNumber(int[] array) {
        boolean numberIsPrime = false;
        int index = 0;
        while (numberIsPrime == false) {
            numberIsPrime = determineNumberIsPrime(array[index]);
            if(numberIsPrime == true) {
                System.out.println("First prime number of array is: " + array[index] + ", index: " + index);
            }
            index++;
        }
    }

    static boolean determineNumberIsPrime(int numberToCheck) {
        if(numberToCheck < 2) {
            return false;
        }else if (numberToCheck == 2 || numberToCheck == 3){
            return true;
        }if (numberToCheck % 2 == 0|| numberToCheck % 3 == 0) {
            return false;
        }
        int squareRootOfNumber = (int)Math.sqrt(numberToCheck) + 1;
        for(int i = 6; i <= squareRootOfNumber; i += 6) {
            if (numberToCheck % (i - 1) == 0 || numberToCheck % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] sortByAscendingOrder (int[] array) {
        boolean swapped;
        for(int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped  == false) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(21) + 10;
        System.out.println("x = " + x + ", y = " + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);

        int lengthOfArray = random.nextInt(6) + 20;
        int[] array = new int[lengthOfArray];
        for(int i = 0; i < lengthOfArray; i++) {
            array[i] = random.nextInt(101) + 1;
        }

        System.out.println("Members of array: " + (Arrays.toString(array)));

        System.out.println("Max value: " + getMaxValue(array));

        System.out.println("Min value: " + getMinValue(array));

        System.out.println("Sum of array: " + getSum(array));

        printAllPrimeNumbers(array);

        printFirstPrimeNumber(array);

        System.out.println("Members of array by ascending order: " + Arrays.toString(sortByAscendingOrder(array)));
    }
}
