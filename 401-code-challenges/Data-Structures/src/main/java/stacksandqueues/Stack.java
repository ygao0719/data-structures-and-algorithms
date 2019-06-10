package stacksandqueues;

import java.util.NoSuchElementException;

public class Stack {
    private Node top;

    public Stack(){
        top = null;
    }

    public void push(int input){
        Node newNode = new Node(input);
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if (top == null) throw new NoSuchElementException("Stack underflow");

        Node temp = top;
        top = top.next;
        temp.next = null;

        return temp.val;
    }

    public int peek(){
        if (top == null) throw new NoSuchElementException("Stack underflow");
        return top.val;
    }

}
