package stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class QueueTest {
    //test enqueue into a queue and peek the top
    @Test
    public void enqueue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        int expect = 1;
        assertEquals(expect, queue.peek());
    }

    //enqueue multiple values into a queue and peek the top
    @Test
    public void test_mutiEnqueu() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        int expect = 1;
        assertEquals(expect, queue.peek());

    }

    //dequeue out of a queue the expected value
    @Test
    public void test_dequeue() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        int expect = 1;
        assertEquals(expect, queue.dequeue());
    }


    //peek into a queue, seeing the expectd value
    @Test
    public void test_peek(){
        Queue queue = new Queue();
        queue.enqueue(1);
        int expect = 1;
        assertEquals(expect, queue.peek());

    }
    //empty a queue after multiple dequeues
    @Test(expected = NullPointerException.class)
    public void test_empty() {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.peek();

    }

    //test instantiate an empty queue
    @Test(expected = NoSuchElementException.class)
    public void test_instantiate(){
        Queue queue = new Queue();
        queue.peek();
    }


}