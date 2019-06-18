package tree;

public class Node<T> {
        public T val;
        public Node left;
        public Node right;
        public Node(T value){
            this.val = value;
            left = right = null;
        }
}
