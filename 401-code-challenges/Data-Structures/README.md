# Data Struture
<!-- Short summary or background information -->
Some methods for single linked list, stack and queue.
## Challenge
<!-- Description of the challenge -->
1. Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
2. Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
3. Define a method called print which takes in no arguments and returns a collection all of the current Node values in the Linked List.
4. .append(value) which adds a new node with the given value to the end of the list
5. .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
6. .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node
7. takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list.
8. merge two linked list
9. Stack: Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
10. Stack: Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
11. Stack: Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
12. Queue: Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
13. Queue: Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
14. Queue: Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.
15. Queue with stacks:  implement our standard queue, but will internally only utilize 2 Stack objects.
16. fifoAnimalShelter: holds only dogs and cats. The shelter operates using a first-in, first-out approach.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
1. insert: Big O time is O(1), space is O(1),
2. includes: Big O time is O(n), space is O(1),
3. print: Big O time is O(n), spce is O(n),
4. append: Big O time is O(n), space is O(1),
5. insertBefore: Big O time is O(n), space is O(1),
6. insertAfter: Big O time is O(n), space is O(1),
7. kthFromEnd: Big O time is O(n), space is O(1).
8. mergeLists: Big O time is O(n), space is O(1).
9. Stack.push(): Big O time is O(1), space is O(1). 
10. Stack.pop(): Big O time is O(1), space is O(1).
11. Stack.peek(): Big O time is O(1), space is O(1).
12. Queue.enqueue(): Big O time is O(1), space is O(1).
13. Queue.dequeue(): Big O time is O(1), space is O(1).
14. Queue.Peek(): Big O time is O(1), space is O(1).
15. PseudoQueue.enqueue(): Big O time is O(1), space is O(1). 
16. PseudoQueue.dequeue(): Big O time is O(n), space is O(1).
17. AnimalShelter.enqueue(): Big O time is O(1), space is O(1). 
18. AnimalShelter.dequeue(): Big O time is O(1), space is O(1). 
## API
<!-- Description of each method publicly available to your Linked List -->
- insert, includes, print, append, insertBefore, insertAfter, kthFromEnd, mergeLists
[code](./src/main/java/Data/linkedList/LinkedList.java)

- Stack [code](./src/main/java/stacksandqueues/Stack.java)
- Queue [code](./src/main/java/stacksandqueues/Queue.java)
- PseudoQueue [code](./src/main/java/queueWithStacks/PseudoQueue.java)
- AnimalShelter [code](./src/main/java/fifoAnimalShelter/AnimalShelter.java)
## White Board
![White Board to insert shift array problem](../assets/linkedList.jpg)
![White Board to kthFromEnd](../assets/linkedlist_kthFromEnd.jpg)
![White Board to mergeList](../assets/mergeLists.jpg)
![White Board to PsedoQueue](../assets/queueWithStacks.jpg)
![White Board to AnimalShelter](../assets/animalShelter.jpg)

