package lt.andrius.arrays;

import java.util.Arrays;
import java.util.Random;

public class DynamicArray {

    static int initialLength = 10;
    static int[] arrayOfNumbers = new int[initialLength];
    static int index = 0;

    //
    static void add (int randomNumber) {
        if(index >= initialLength){
            int[] tempArray = new int[index + 1];

            for(int i = 0; i < index; i++){
                tempArray[i] = arrayOfNumbers[i];
            }
            arrayOfNumbers = tempArray;
        }

        arrayOfNumbers[index] = randomNumber;
        index++;
        System.out.println(Arrays.toString(arrayOfNumbers));
    }

    static int getAt (int index) {
        int memberOfArray = arrayOfNumbers[index];
        return memberOfArray;
    }

    public static void main(String[] args) {

//        int arrayLength = 10;
//        int[] array = new int[arrayLength];
        int numberOfNumbersToAddToArray = 20;

        Random random = new Random();

        //generate and pass values to empty array
        for(int i = 0; i < numberOfNumbersToAddToArray; i++) {
            int randomNumber = random.nextInt(21) + 1;
            add(randomNumber);
        }

        //get value by index
        int randomIndexOfArray = random.nextInt(numberOfNumbersToAddToArray);
        System.out.println("random index: " + randomIndexOfArray + ", member of array: " + getAt(randomIndexOfArray));
    }
}
