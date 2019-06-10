package stacksandqueues;

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
        Node temp = top;
        top = top.next;
        temp.next = null;

        return temp.val;
    }

    public int peek(){
        return top.val;
    }

}
