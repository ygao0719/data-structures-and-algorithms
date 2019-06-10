package stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StackTest {

    //test push and pop
    @Test
    public void test_pushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        int expect = 1;
        assertEquals(expect, stack.pop());
    }
    //test push multiple value into a stack
    @Test
    public void test_multi_pushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int expect = 3;
        assertEquals(expect, stack.pop());
    }

    //empty a stack after multiple value
    @Test(expected = NoSuchElementException.class)
    public void test_empty() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.pop();
        stack.pop();

        stack.peek();
    }

    //peek the next item on the stack
    @Test
    public void test_peek(){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.peek());
    }

}