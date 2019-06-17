package tree;


import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public class Node<T> {
        T val;
        Node left;
        Node right;
        public Node(T value){
            this.val = value;
            left = right = null;
        }
    }

    public class BinaryTree{
        Node root;

        BinaryTree(){
            this.root = null;
        }

        public List<T> printPreOrder(Node node){
            List<T> result = new ArrayList<>();

//            if (node == null){
//                throw new IllegalArgumentException("This binary tree is empty.");
//            }

            result.add((T)node.val);

            if(node.left != null) {
                printPreOrder(node.left);
            }
            if (node.right != null) {
                printPreOrder(node.right);
            }
            return result;

        }

        public List<T> printInOrder(Node node){

            List<T> result = new ArrayList<>();

            if (node.left != null) {
                printPreOrder(node.left);
            }

            result.add((T)node.val);

            if (node.right != null) {
                printPreOrder(node.right);
            }
            return result;
        }

        public void printPostOrder(Node node){
            List<T> result = new ArrayList<>();
            if (node.left != null) {
                printPreOrder(node.left);
            }
            if (node.right != null) {
                printPreOrder(node.right);
            }

            result.add((T)node.val);
        }
    }

}
