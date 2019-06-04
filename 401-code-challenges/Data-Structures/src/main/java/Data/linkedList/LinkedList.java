package Data.linkedList;

import java.util.ArrayList;
import java.util.Queue;

public class LinkedList {
    public class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }
    }

    Node head;
    LinkedList(){
        this.head = null;
    }

    public void insert(int value){
        Node newHead = new Node(value);
        newHead.next = head;
        head = newHead;
    }

    public boolean includes(int value){
        Node current = head;
        while(current != null){
            if (current.val == value){
                return true;
            }else{
                current = current.next;
            }
        }
        return false;
    }

    public ArrayList print(){
        Node current = head;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(current != null){
            result.add(current.val);
            current = current.next;
        }
        return result;
    }

    public void append(int value){
        //if linked list is empty
        Node new_node = new Node(value);

        if (head == null){
            head = new Node(value);
            return;
        }
        new_node.next = null;
        //if linked list is not empty
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
    }


}
