package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortSolutionTest {

    //test if the array is empty
    @Test
    public void test_mergeSort_empty() {
        int[] arr = {};
        MergeSortSolution test = new MergeSortSolution();
        test.mergeSort(arr);
        int[] expect = {};
        assertArrayEquals(expect,arr);
    }

    //test if the array only has one element
    @Test
    public void test_merge_one() {
        int[] arr = {4};
        MergeSortSolution test = new MergeSortSolution();
        test.mergeSort(arr);
        int[] expect = {4};
        assertArrayEquals(expect,arr);

    }

    //test if the array only has two element
    @Test
    public void test_merge_two() {
        int[] arr = {4,2};
        MergeSortSolution test = new MergeSortSolution();
        test.mergeSort(arr);
        int[] expect = {2,4};
        assertArrayEquals(expect,arr);

    }

    //test if the array has many elements
    @Test
    public void test_merge_many() {
        int[] arr = {5, 1, 6, 2, 3, 4 };
        MergeSortSolution test = new MergeSortSolution();
        test.mergeSort(arr);
        int[] expect = {1,2,3,4,5,6};
        assertArrayEquals(expect,arr);

    }


}