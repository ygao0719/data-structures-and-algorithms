package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    //test add meathod
    @Test
    public void add() {
        BinarySearchTree instance = new BinarySearchTree();

        instance.add(50);
        instance.add(30);
        instance.add(20);
        instance.add(40);
        instance.add(70);
        instance.add(60);
        instance.add(80);
        List<Integer> expect = new ArrayList<>(Arrays.asList(20,30,40,50,60,70,80));
        assertEquals(expect,instance.printInOrder(instance.root));
    }


    //test contains method
    @Test
    public void contains() {
        BinarySearchTree instance = new BinarySearchTree();

        instance.add(50);
        instance.add(30);
        instance.add(20);
        instance.add(40);
        instance.add(70);
        instance.add(60);
        instance.add(80);

        assertTrue(instance.contains(50));
        assertFalse(instance.contains(10));

    }
}