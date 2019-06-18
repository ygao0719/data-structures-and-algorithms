package fizzBuzzTree;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    //test happy path
    @Test
    public void fizzBuzzTree() {

        FizzBuzzTree instance = new FizzBuzzTree();
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(15);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        instance.fizzBuzzTree(bt);
        List expect = new ArrayList<>(Arrays.asList("FizzBuzz",2,"Fizz"));
        assertEquals(expect, bt.printPreOrder(bt.root));

    }

    //test if all elements are not fizz buzz
    @Test
    public void test_all_number() {
        FizzBuzzTree instance = new FizzBuzzTree();
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(4);

        instance.fizzBuzzTree(bt);
        List expect = new ArrayList<>(Arrays.asList(1,2,4));
        assertEquals(expect, bt.printPreOrder(bt.root));

    }

    //test empty binary tree
    @Test
    public void fizzBuzz() {
        FizzBuzzTree instance = new FizzBuzzTree();
        BinaryTree bt = new BinaryTree();
        instance.fizzBuzzTree(bt);

        List expect = new ArrayList();
        assertEquals(expect,bt.printPreOrder(bt.root));
    }
}