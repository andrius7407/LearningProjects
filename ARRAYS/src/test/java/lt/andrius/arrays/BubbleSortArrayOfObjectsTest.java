package lt.andrius.arrays;

import lt.andrius.arrays.BubbleSortArrayOfObjects;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortArrayOfObjectsTest {

    BubbleSortArrayOfObjects bubble = new BubbleSortArrayOfObjects();

    @Test
    public void sortByAgeTest() {
//        lt.andrius.arrays.lt.andrius.arrays.Person[] person = {new lt.andrius.arrays.lt.andrius.arrays.Person(15, "kopa")};
        lt.andrius.arrays.Person[] person = {new lt.andrius.arrays.Person(60, "vienas"),
                new lt.andrius.arrays.Person(70, "oras"),
                new lt.andrius.arrays.Person(30, "peilis"),
                new lt.andrius.arrays.Person(19, "baras"),
                new lt.andrius.arrays.Person(45, "colis"),
                new lt.andrius.arrays.Person(15, "kopa")};

//        lt.andrius.arrays.lt.andrius.arrays.Person[] person2 = {new lt.andrius.arrays.lt.andrius.arrays.Person(15, "kopa")};
        lt.andrius.arrays.Person[] person2 = {new lt.andrius.arrays.Person(15, "kopa"),
                new lt.andrius.arrays.Person(19, "baras"),
                new lt.andrius.arrays.Person(30, "peilis"),
                new lt.andrius.arrays.Person(45, "colis"),
                new lt.andrius.arrays.Person(60, "vienas"),
                new lt.andrius.arrays.Person(70, "oras")};

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge() + " " + person[i].getName());
        }

        for (int i = 0; i < person2.length; i++) {
            System.out.println(person2[i].getAge() + " " + person2[i].getName());
        }

        assertArrayEquals(person2, bubble.bubbleSortArrayOfPersonsByAge(person));

//        lt.andrius.arrays.lt.andrius.arrays.Person p1 = new lt.andrius.arrays.lt.andrius.arrays.Person(19, "Jonas", "Petraitis");
//        lt.andrius.arrays.lt.andrius.arrays.Person p2 = new lt.andrius.arrays.lt.andrius.arrays.Person(19, "Jonas", "Jonaitis");
//        System.out.println(p1.equals(p2));
    }
}

class Person {
    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }




    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (!lt.andrius.arrays.Person.class.isAssignableFrom(obj.getClass())) return false;

        final lt.andrius.arrays.Person other = (lt.andrius.arrays.Person) obj;
//
//        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
//            return false;
//        }

        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.age != other.age) {
            return false;
        }

        return true;
    }
}
