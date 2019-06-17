package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {
    //instantiate an empty tree
    @Test
    public void test_tree(){
        Tree tree = new Tree();
        assertNull(tree.root);
    }

    //instantiate a tree with a root node
    @Test
    public void test_tree_single_root(){
        Node newNode = new Node(4);
        Tree tree = new Tree();
        tree.root = newNode;
        assertEquals(4, tree.root.val);
    }
}