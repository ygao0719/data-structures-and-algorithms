package tree;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree{
        Node root;
        BinarySearchTree(){
            this.root = null;
        }

        public void add(T val){
            root = insert(root, val);
        }

        public Node insert(Node root, T value){
            if (root == null){
                root = new Node(value);
                return root;
            }

            if(value.compareTo((T)root.val) < 0){
                root.left = insert(root.left,value);
            }else if (value.compareTo((T)root.val) > 0){
                root.right = insert(root.right, value);
            }

            return root;
        }

        public boolean contains(T inputVal){

            return containsHelper(root, inputVal);
        }

        public boolean containsHelper(Node root, T inputValue) {
            if (root == null) {
                return false;
            }

            if (root.val == inputValue) {
                return true;
            }

            if (inputValue.compareTo((T)root.val) < 0) {
                return containsHelper(root.left,inputValue);
            }else if (inputValue.compareTo((T)root.val) > 0){
                return containsHelper(root.right,inputValue);
            }
            return false;
        }

}
