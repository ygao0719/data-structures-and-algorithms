# Singly Linked List
<!-- Short summary or background information -->
Some methods for single linked list. 
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
## API
<!-- Description of each method publicly available to your Linked List -->
insert, includes, print, append, insertBefore, insertAfter, kthFromEnd, mergeLists
## [code](./src/main/java/Data/linkedList/LinkedList.java)

## White Board
![White Board to insert shift array problem](../assets/linkedList.jpg)
![White Board to kthFromEnd](../assets/linkedlist_kthFromEnd.jpg)
![White Board to kthFromEnd](../assets/mergeLists.jpg)

