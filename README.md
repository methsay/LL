# LL — Linked List Implementation and Practice

A collection of Java programs implementing and practicing Linked List data structures — from basic singly linked lists to doubly circular linked lists and common interview questions.

## Files

### `LLBasics.java`
A minimal singly linked list built from scratch with a `Node` inner class.
- `printLinkedList(head)` — iterative traversal and print
- `displayRecurively(head)` — recursive traversal and print
- `length(head)` — counts and prints the number of nodes

### `Implementation.java`
A more complete singly linked list class (`linkedlist`) with `head` and `tail` pointers, supporting:
- `insertAtStart(val)` — insert at the head
- `insertAtEnd(val)` — insert at the tail
- `insertAtAny(pos, val)` — insert at an arbitrary position
- `getElementByPos(pos)` — retrieve value at a given index
- `deleteAtIndex(pos)` — delete node at a given index
- `display()` — print the list
- `size()` — count the nodes

### `DoublyCircularLinkedListImplementation.java`
Operations on doubly linked and doubly circular linked lists using `Node` with `next`/`prev` pointers:
- `display(head)` / `displayrev(tail)` — forward/backward traversal
- `displayRandom(node)` — traverse from any node by first walking back to head
- `insertAtHead`, `insertAtTail`, `insertAtAnyIndex` — insertion variants
- `deleteHead`, `deleteTail`, `deleteAtAnyIndex` — deletion variants
- `displayCLL(head)` / `lengthC(head)` — circular list traversal and length
- `deleteCHead(head)` — delete head of a circular list

### `LinkedListInterviewQuestions.java`
A `ListNode` class packed with classic linked list interview problems, plus a `LinkedListInterviewQuestions` class with a `main` demo:
- `deleteNode(node)` — delete a node given only a reference to it
- `nthNodeFromLast(head, pos)` — two-pointer approach to find the nth node from the end
- `removeNthNode(head, pos)` — remove the nth node from the end
- `lengthOfLL(head)` — list length
- `intersection(head)` — find intersection point of two lists (length-difference approach)
- `middle(head)` / `middleElement(head)` — find the middle node (loop-based and fast/slow pointer)
- `deleteMiddleElement(head)` — delete the middle node
- `hasCycle(head)` — Floyd's cycle detection
- `merge(list1, list2)` / `mergeWithoutExtraSpace(list1, list2)` — merge two sorted lists
- `oddEven(head)` — partition nodes by odd/even value
- `removeDuplicatesFunc(head)` — remove duplicates from a sorted list
- `reverseLL(head)` / `iterativeReverse(head)` — reverse a list (recursive and iterative)
- `isPalindrome(head)` / `isPalindrome2(head)` — palindrome check (deep-copy approach and O(1)-space fast/slow + reverse approach)
- `pairSum(head)` — max pair sum from front/back using reversal of the second half
- `oddEvenIndices(head)` — split list into nodes at odd and even positions

## Purpose

This repo is a personal practice space for mastering linked list fundamentals and commonly asked interview patterns (two-pointer techniques, in-place reversal, cycle detection, merging, and palindrome checks) in Java.
