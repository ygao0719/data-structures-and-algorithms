package stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    private Node<T> top;

    public Stack(){
        top = null;
    }

    public void push(T input){
        Node<T> newNode = new Node<>(input);
        newNode.next = top;
        top = newNode;
    }

    public T pop(){
        if (top == null) throw new NoSuchElementException("Stack empty");

        Node<T> temp = top;
        top = top.next;
        temp.next = null;

        return temp.val;
    }

    public T peek(){
        if (top == null) throw new NoSuchElementException("Stack is empty");
        return top.val;
    }

}
