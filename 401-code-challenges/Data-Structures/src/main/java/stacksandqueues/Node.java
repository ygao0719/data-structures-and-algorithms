package stacksandqueues;

public class Node<T> {
    Node<T> next;
    public T val;
    Node(T value){
        this.val = value;
        this.next = null;
    }
}
