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

}