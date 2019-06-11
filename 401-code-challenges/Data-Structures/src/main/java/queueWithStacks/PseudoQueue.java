package queueWithStacks;

import java.util.NoSuchElementException;
import java.util.Stack;


public class PseudoQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public PseudoQueue(){
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public void enqueue( int input){
        stack1.push(input);
    }

    public int dequeue(){
        int x;
        if (stack1.isEmpty()&& stack2.isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                x = stack1.pop();
                stack2.push(x);
            }
        }
        x = stack2.pop();
        return x;
    }

}
