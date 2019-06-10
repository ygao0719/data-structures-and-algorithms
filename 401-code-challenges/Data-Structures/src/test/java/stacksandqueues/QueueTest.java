package stacksandqueues;

import org.junit.Test;

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


}