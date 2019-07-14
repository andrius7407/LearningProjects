package lt.andrius.arrays;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSortArrayOfObjects {

    public static void main(String[] args) {

        Person[] person = new Person[7];

        for (int i = 0; i < person.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(13,79);
            String randomName = generateRandomString();
            person[i] = new Person(randomAge, randomName);
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge() + " " + person[i].getName());
        }

        person = bubbleSortArrayOfPersonsByAge(person);

        System.out.println();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge() + " " + person[i].getName());
        }
    }

    private static String generateRandomString() {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    static Person[] bubbleSortArrayOfPersonsByAge(Person[] person) {
        boolean swapped;
        for(int i = 0; i < person.length - 1; i++) {
            swapped = false;
            for(int j = 0; j < person.length - i - 1; j++) {
                if(person[j].getAge() > person[j + 1].getAge()) {
                    Person temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        return person;
    }
}
