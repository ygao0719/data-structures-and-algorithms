package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
        public Node root;

        public BinaryTree(){
            this.root = null;
        }
        List<T> result = new ArrayList<>();

        public List<T> printPreOrder(Node node){
            if (node == null){
                return new ArrayList<>();
            }
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


            if (node.left != null) {
                printInOrder(node.left);
            }

            result.add((T)node.val);

            if (node.right != null) {
                printInOrder(node.right);
            }
            return result;
        }

        public List<T> printPostOrder(Node node){
            if (node.left != null) {
                printPostOrder(node.left);
            }
            if (node.right != null) {
                printPostOrder(node.right);
            }

            result.add((T)node.val);
            return result;
        }


}
