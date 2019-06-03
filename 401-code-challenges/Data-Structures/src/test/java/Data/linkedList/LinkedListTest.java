package Data.linkedList;

import org.junit.Test;

import java.util.ArrayList;

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
        instanceForTest.insert(5);
        assertEquals(5,instanceForTest.head.val);

    }

    @Test
    public void includes() {
        LinkedList instanceForTest = new LinkedList();
        instanceForTest.insert(2);
        instanceForTest.insert(3);
        instanceForTest.insert(4);

        assertEquals(true,instanceForTest.includes(2));
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
}