package tree;

public class BinarySearchTree extends BinaryTree{
        Node root;
        BinarySearchTree(){
            this.root = null;
        }

        public void add(int val){
            root = insert(root, val);
        }

        public Node insert(Node root, int value){
            if (root == null){
                root = new Node(value);
                return root;
            }

            if(value < root.val){
                root.left = insert(root.left,value);
            }else if (value > root.val){
                root.right = insert(root.right, value);
            }

            return root;
        }

        public boolean contains(int inputVal){

            return containsHelper(root, inputVal);
        }

        public boolean containsHelper(Node root, int inputValue) {
            if (root == null) {
                return false;
            }

            if (root.val == inputValue) {
                return true;
            }

            if (inputValue < root.val) {
                return containsHelper(root.left,inputValue);
            }else if (inputValue > root.val){
                return containsHelper(root.right,inputValue);
            }
            return false;
        }

}
