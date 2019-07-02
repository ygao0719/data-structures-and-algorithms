package sort;

import org.junit.Test;
import sort.InsertionSort;

import static org.junit.Assert.*;

public class InsertionSortTest {

    //test if the array is empty
    @Test
    public void test_sort() {
        int arr[] = {};
        InsertionSort test = new InsertionSort();
        test.sort(arr);
    }

    //test if thr array only has one element
    @Test
    public void test_sort_one() {
        int arr[] = {3};
        InsertionSort test = new InsertionSort();
        test.sort(arr);
        int expect[] = {3};
        assertArrayEquals(expect,arr);
    }

    //test normal array
    @Test
    public void test_sort_normal () {
        int arr[] = {33,2,1,4};
        InsertionSort test = new InsertionSort();
        test.sort(arr);
        int expect[] = {1,2,4,33};
        assertArrayEquals(expect,arr);
    }

}