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
        Node newNode = new Node(input);
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if (front == null){
            throw new NoSuchElementException("Queue underflow");
        }

        Node temp = front;
        front = front.next;
        temp.next = null;

        return temp.val;
    }

    public int peek(){
        if (front == null){
            throw new NoSuchElementException("Queue underflow");
        }

        return front.val;
    }
}
