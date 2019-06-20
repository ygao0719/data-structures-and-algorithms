package tree;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class BinaryTreeTest {
    //add a left child and right child to a single root node
    @Test
    public void test_BinaryTree(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
    }

    //return a collection from a preorder traversal
    @Test
    public void test_preOrder(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2,3));
        assertEquals(expect,bt.printPreOrder(bt.root));
    }


    //return a collection from a inorder traversal
    @Test
    public void test_inOrder(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        List<Integer> expect = new ArrayList<>(Arrays.asList(2,1,3));
        assertEquals(expect,bt.printInOrder(bt.root));
    }

    //return a collection from a postorder traversal
    @Test
    public void test_postOrder(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        List<Integer> expect = new ArrayList<>(Arrays.asList(2,3,1));
        assertEquals(expect,bt.printPostOrder(bt.root));
    }

    // test breath first traversal
    @Test
    public void test_breath_first(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        List<Integer> expect = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        assertEquals(expect, bt.printBreathFirst(bt));

    }

    //test this tree only has root
    @Test
    public void test_breath_first_root(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);

        List<Integer> expect = new ArrayList<>(Arrays.asList(1));
        assertEquals(expect, bt.printBreathFirst(bt));

    }

    //test string
    @Test
    public void test_breath_first_string(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node("This");
        bt.root.left = new Node("is");
        bt.root.right = new Node("cool.");

        List<String> expect = new ArrayList<>(Arrays.asList("This","is","cool."));
        assertEquals(expect, bt.printBreathFirst(bt));

    }

    //test find max in a binary tree
    @Test(expected = IllegalArgumentException.class)
    public void test_emptyTree(){
        BinaryTree bt = new BinaryTree();

        bt.find_maximum_value(bt);
    }


    //test one node binary tree
    @Test
    public void test_oneNode(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(4);
        int expect = 4;
        assertEquals(expect,bt.find_maximum_value(bt));
    }

    //test happy path
    @Test
    public void test_normalFindMax(){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(2);
        bt.root.left = new Node(7);
        bt.root.right = new Node(5);
        bt.root.left.right = new Node(6);
        bt.root.left.right.left = new Node(1);
        bt.root.left.right.right = new Node(11);
        bt.root.right.right = new Node(9);
        bt.root.right.right.left = new Node(4);

        int expect = 11;
        assertEquals(expect,bt.find_maximum_value(bt));
    }
}