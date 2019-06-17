package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
        Node root;

        BinaryTree(){
            this.root = null;
        }
        List<Integer> result = new ArrayList<>();

        public List<Integer> printPreOrder(Node node){


            result.add(node.val);

            if(node.left != null) {
                printPreOrder(node.left);
            }
            if (node.right != null) {
                printPreOrder(node.right);
            }
            return result;

        }

        public List<Integer> printInOrder(Node node){


            if (node.left != null) {
                printInOrder(node.left);
            }

            result.add(node.val);

            if (node.right != null) {
                printInOrder(node.right);
            }
            return result;
        }

        public List<Integer> printPostOrder(Node node){
            if (node.left != null) {
                printPostOrder(node.left);
            }
            if (node.right != null) {
                printPostOrder(node.right);
            }

            result.add(node.val);
            return result;
        }


}
