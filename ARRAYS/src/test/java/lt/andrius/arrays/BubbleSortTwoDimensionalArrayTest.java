package lt.andrius.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTwoDimensionalArrayTest {

    BubbleSortTwoDimensionalArray bubble = new BubbleSortTwoDimensionalArray();

    @Test
    public void sortByFirstMemberTest() {
        int[][] arrayExpected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arrayActual = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};

        assertArrayEquals(arrayExpected, bubble.bubleSortTwoDimArrayByFirstMember(arrayActual));
    }
}
