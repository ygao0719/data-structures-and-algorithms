package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    //test for even length of array
    @Test
    public void testEvenArray() {
        ArrayShift libraryForTesing = new ArrayShift();
        int[] inputArr = new int[]{1, 3, 5, 7};
        int[] expectedOutput = new int[]{1, 3, 4, 5, 7};
        assertArrayEquals("insert a number inside the array",
                expectedOutput,
                libraryForTesing.insertShiftArray(inputArr, 4));

    }
    //test for odd length of array
    @Test
    public void testOddArray(){
        ArrayShift libraryForTesing = new ArrayShift();
        int[] inputArr = new int[]{1, 3, 7, 9, 14};
        int[] expectedOutput = new int[]{1, 3, 7, 3, 9, 14};
        assertArrayEquals("insert a number inside the array",
                expectedOutput,
                libraryForTesing.insertShiftArray(inputArr, 3));

    }
}