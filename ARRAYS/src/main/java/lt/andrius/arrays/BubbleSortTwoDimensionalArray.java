package lt.andrius.arrays;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTwoDimensionalArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] arrayOfNumbers = new int[5][5];



        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                arrayOfNumbers[i][j] = random.nextInt(26);
            }
        }
        System.out.println("Length of two-dimensional array: " + arrayOfNumbers.length);
        printTwoDimensionalArray(arrayOfNumbers);

        arrayOfNumbers = bubleSortTwoDimArrayByFirstMember(arrayOfNumbers);

        System.out.println();
        System.out.println("Sorted array:");
        printTwoDimensionalArray(arrayOfNumbers);
    }

    static int[][] bubleSortTwoDimArrayByFirstMember(int[][] arrayOfNumbers) {

        boolean swaped;
        for(int i = 0; i < arrayOfNumbers.length - 1; i++) {
            swaped = false;
            for(int j = 0; j < arrayOfNumbers[i].length - i - 1; j++) {
                if (arrayOfNumbers[j][0] > arrayOfNumbers[j + 1][0]) {
                    int[] temp = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = temp;
                    swaped = true;
                }
            }
        }
        return arrayOfNumbers;
    }

    static void printTwoDimensionalArray(int[][] arrayOfNumbers) {
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(Arrays.toString(arrayOfNumbers[i]));
        }
    }
}
