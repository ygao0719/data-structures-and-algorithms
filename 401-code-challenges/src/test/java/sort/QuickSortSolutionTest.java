package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortSolutionTest {

    //test if arr is empty
    @Test
    public void test_empty() {
        QuickSortSolution test = new QuickSortSolution();
        int arr[] = {};
        test.quickSort(arr,0,0);
    }

    //test if array has only one element
    @Test
    public void test_one_array() {
        QuickSortSolution test = new QuickSortSolution();
        int arr[] = {4};
        test.quickSort(arr,0,0);
        int expect[] = {4};
        assertArrayEquals(expect,arr);
    }

    //test normal array
    @Test
    public void test_quickSort() {
        QuickSortSolution test = new QuickSortSolution();
        int arr[] = {4,3,6,1};
        test.quickSort(arr,0,3);
        int expect[] = {1,3,4,6};
        assertArrayEquals(expect,arr);
    }
}