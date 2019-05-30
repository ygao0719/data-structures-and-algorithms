package codechallenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    //test if the array is empty
    @Test
    public void testBinarySearch_Empty(){
        BinarySearch instanceForTest = new BinarySearch();
        int[] inputArr = new int[]{};
        int expect = -1;
        assertEquals(expect, instanceForTest.binarySearch(inputArr,4));
    }

    // test if the array is
    @Test
    public void testBinarySearch(){
        BinarySearch instanceForTest = new BinarySearch();
        int[] inputArr = new int[]{1,2,4,6,7,9};
        int expect = 4 ;
        assertEquals(expect, instanceForTest.binarySearch(inputArr,7));
    }

}
