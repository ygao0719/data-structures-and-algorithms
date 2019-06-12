package stacksandqueues;

import java.util.NoSuchElementException;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    Queue(){
        front = null;
        rear = null;
    }

    public void enqueue(T input){
        Node<T> oldLast = rear;
        rear = new Node<>(input);
        rear.next = null;
        if (front == null){
            front = rear;
        }else {
            oldLast.next = rear;
        }
    }

    public T dequeue(){
        if (front == null && rear == null){
            throw new NoSuchElementException("Queue is empty");
        }

        Node<T> temp = front;
        front = front.next;
        temp.next = null;

        return temp.val;
    }

    public T peek(){
        if (front == null && rear == null){
            throw new NoSuchElementException("Queue is empty");
        }

        return front.val;
    }
}
