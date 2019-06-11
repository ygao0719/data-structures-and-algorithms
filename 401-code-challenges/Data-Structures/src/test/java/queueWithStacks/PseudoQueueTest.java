package queueWithStacks;

import org.junit.Test;
import stacksandqueues.Stack;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void test_enqueue() {
        PseudoQueue instanceForTest = new PseudoQueue();
        instanceForTest.enqueue(5);
        instanceForTest.enqueue(10);
        instanceForTest.enqueue(15);

        assertEquals(5,instanceForTest.dequeue());
    }

    @Test
    public void test_dequeue() {
        PseudoQueue instanceForTest = new PseudoQueue();
        instanceForTest.enqueue(5);
        assertEquals(5,instanceForTest.dequeue());

    }
    //if queue is empty
    @Test(expected = NoSuchElementException.class)
    public void test_dequeue_empty() {
        PseudoQueue instanceForTest = new PseudoQueue();
        instanceForTest.dequeue();
    }

}