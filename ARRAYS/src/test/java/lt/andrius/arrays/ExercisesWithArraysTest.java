package lt.andrius.arrays;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExercisesWithArraysTest {

    ExercisesWithArrays exercises = new ExercisesWithArrays();

    @Test
    public void testGetMaxValue() {
        int[]array = {3, 2, 9, 14, 15};
        //int maxValue = 15;

        assertEquals(15, exercises.getMaxValue(array));
    }

}
