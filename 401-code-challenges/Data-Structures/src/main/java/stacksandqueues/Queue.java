package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue {
    private Node front;
    private Node rear;

    Queue(){
        front = null;
        rear = null;
    }

    public void enqueue(int input){
        Node oldLast = rear;
        rear = new Node(input);
        rear.next = null;
        if (front == null){
            front = rear;
        }else {
            oldLast.next = rear;
        }
    }

    public int dequeue(){
        if (front == null && rear == null){
            throw new NoSuchElementException("Queue is empty");
        }

        Node temp = front;
        front = front.next;
        temp.next = null;

        return temp.val;
    }

    public int peek(){
        if (front == null && rear == null){
            throw new NoSuchElementException("Queue is empty");
        }

        return front.val;
    }
}
