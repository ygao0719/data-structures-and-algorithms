package TreeIntersection;

import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    //happy path
    @Test
    public void tree_intersection() {
        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();

        bt1.root = new Node(2);
        bt1.root.left = new Node(7);
        bt1.root.right = new Node(5);
        bt1.root.left.right = new Node(6);
        bt1.root.left.right.left = new Node(1);
        bt1.root.left.right.right = new Node(11);
        bt1.root.right.right = new Node(9);
        bt1.root.right.right.left = new Node(4);


        bt2.root = new Node(2);
        bt2.root.left = new Node(7);
        bt2.root.right = new Node(5);

        TreeIntersection test = new TreeIntersection();

        List expect = new ArrayList<>(Arrays.asList(7,2,5));
        assertEquals(expect, test.tree_intersection(bt1,bt2));

    }

    @Test(expected = NullPointerException.class)
    public void test_EmptyTree(){
        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();

        bt1.root = new Node(2);
        bt1.root.left = new Node(7);

        TreeIntersection test = new TreeIntersection();
        assertNull(test.tree_intersection(bt1,bt2));
    }

    //no intersection
    @Test
    public  void test_noIntersection(){
        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();

        bt1.root = new Node(2);
        bt1.root.left = new Node(7);

        bt2.root = new Node(3);
        bt2.root.right = new Node(8);

        TreeIntersection test = new TreeIntersection();
        List expect = new ArrayList();
        assertEquals( expect,test.tree_intersection(bt1,bt2));
    }

}