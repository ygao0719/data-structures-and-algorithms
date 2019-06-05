package Data.linkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test()
    public void testEmpty() {
        LinkedList instanceForTest = new LinkedList();
        assertEquals("test instantiate an empty linked list",null,instanceForTest.head);
    }

    @Test()
    public void insert() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(3);

        assertEquals(3,instanceForTest.head.val);
    }

    @Test()
    public void insert_Multi() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(1);
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(3);
        instanceForTest.insert(5);

        assertEquals(5,instanceForTest.head.val);
    }

    //return true when finding a value within the linked list that exists
    @Test
    public void includes() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(4);

        assertEquals(true,instanceForTest.includes(2));
    }

    //return false when searching for a value in the linked list that does not exist
    @Test
    public void includes_False() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(4);

        assertEquals(false,instanceForTest.includes(1));

    }

    @Test
    public void print() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(4);

        ArrayList<Integer> expect = new ArrayList<>();
        expect.add(4);
        expect.add(3);
        expect.add(2);

        assertEquals(expect,instanceForTest.print());
    }

    //test for 4->3->2->null
    @Test
    public void testAppend() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(4);

        instanceForTest.append(5);
        ArrayList<Integer> expect = new ArrayList<Integer>(Arrays.asList(4,3,2,5));

        assertEquals(expect,instanceForTest.print());
    }
    //test add multiple node to the end of linked list
    @Test
    public void testAppend_Multiple() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(4);

        instanceForTest.append(5);
        instanceForTest.append(6);
        instanceForTest.append(7);

        ArrayList<Integer> expect = new ArrayList<Integer>(Arrays.asList(4,3,2,5,6,7));

        assertEquals(expect,instanceForTest.print());
    }

    //test for empty linked list
    @Test
    public void testAppend_Empty(){
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.head = null;
        instanceForTest.append(5);
        ArrayList<Integer> expect = new ArrayList<>(Arrays.asList(5));

        assertEquals(expect, instanceForTest.print());

    }
    //insert a node before a node located in the middle of linked list
    @Test
    public void testInsertBefore(){
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(1);

        instanceForTest.insertBefore(3,5);
        ArrayList<Integer> expect = new ArrayList<>(Arrays.asList(1,5,3,2));

        assertEquals(expect, instanceForTest.print());

    }
    //insert a node before the first node of a linked list
    @Test
    public void testInsertBefore_firstNode() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(1);

        instanceForTest.insertBefore(1,5);
        ArrayList<Integer> expect = new ArrayList<>(Arrays.asList(5,1,3,2));

        assertEquals(expect, instanceForTest.print());
    }
    //insert after a node in the middle of the linked list
    @Test
    public void testInsertAfter() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(1);

        instanceForTest.insertAfter(3,5);
        ArrayList<Integer> expect = new ArrayList<>(Arrays.asList(1,3,5,2));

        assertEquals(expect, instanceForTest.print());
    }

    // insert a node after the last node of the linked list
    @Test
    public void testInsertAfter_lastNode() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(1);

        instanceForTest.insertAfter(2,5);
        ArrayList<Integer> expect = new ArrayList<>(Arrays.asList(1,3,2,5));

        assertEquals(expect, instanceForTest.print());
    }

    //k is greater than the length of linked list
    @Test(expected = NullPointerException.class)
    public void test_kthFromEnd_kLarge() {
        LinkedList instanceForTest = new LinkedList();

        instanceForTest.kthFromEnd(5);

    }

    //k is same with the length of linked list
    @Test(expected = NullPointerException.class)
    public void test_kthFromEnd_kSame() {
        LinkedList instanceForTest = new LinkedList();

        instanceForTest.kthFromEnd(3);
    }
    //k is not a positive integer
    @Test(expected = NullPointerException.class)
    public void test_kthFromEnd_kNegetive() {
        LinkedList instanceForTest = new LinkedList();

        instanceForTest.kthFromEnd(-3);
    }
    //the linked list is of a size 1

    @Test
    public void test_kthFromEnd_SizeOne() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(1);
        int expect = 1;
        assertEquals(expect,instanceForTest.kthFromEnd(0));
    }

    //k is somewhere in the middle of linked list
    @Test
    public void test_kthFromEnd_happyPath() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(3);
        instanceForTest.insert(2);
        instanceForTest.insert(1);

        int expect = 2;
        assertEquals(expect,instanceForTest.kthFromEnd(1));
    }

}
