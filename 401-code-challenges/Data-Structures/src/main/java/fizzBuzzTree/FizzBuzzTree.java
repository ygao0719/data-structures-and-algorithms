package fizzBuzzTree;

import tree.BinarySearchTree;
import tree.BinaryTree;
import tree.Node;

public class FizzBuzzTree<T> {

    public void fizzBuzzTree (BinaryTree inputTree){

        helper(inputTree.root);
    }

    public void helper(Node node){
        if (node != null){
            node.val = fizzBuzz((T)node.val);
            helper(node.left);
            helper(node.right);
        }
    }

    public T fizzBuzz(T value){
        if ((int)value % 15 == 0){
            return (T)"FizzBuzz";
        }else if ((int)value % 5 ==0){
            return (T)"Buzz";
        }else if ((int)value % 3 ==0){
            return (T)"Fizz";
        }else {
            return value;
        }
    }
}
