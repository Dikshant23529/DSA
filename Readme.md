# Singly Linked List and Circular Singly Linked List in Java

## Overview

This repository provides Java implementations of two fundamental data structures in computer science: the Singly Linked List and the Circular Singly Linked List. Both implementations include various essential operations, demonstrating the versatility and functionality of these data structures.

## Singly Linked List

A **Singly Linked List** is a linear data structure consisting of nodes where each node contains a data part and a reference to the next node in the sequence. The last node's next reference is null, indicating the end of the list.

### Features and Operations

- **Node Structure**: Each node contains an integer data and a reference to the next node.
- **Insertion at the Beginning**: Add a new node at the start of the list.
- **Insertion at the End**: Add a new node at the end of the list.
- **Insertion at Any Position**: Add a new node at a specific position in the list.
- **Deletion from the Beginning**: Remove the node at the start of the list.
- **Display**: Print all nodes in the list from head to end.
- **Count**: Count the number of nodes in the list.

### Usage

The main method demonstrates the following operations:
1. Inserting nodes at the beginning of the list.
2. Inserting nodes at the end of the list.
3. Inserting nodes at specific positions in the list.
4. Deleting the first node of the list.
5. Displaying the contents of the list.
6. Counting the number of nodes in the list.

## Circular Singly Linked List

A **Circular Singly Linked List** is a variation of the singly linked list where the last node points to the first node, forming a circular structure. This ensures there is no null reference in the list, making it suitable for applications that require cyclic traversal.

### Features and Operations

- **Node Structure**: Each node contains an integer data and a reference to the next node.
- **Circular Structure**: The last node points back to the first node.
- **Insertion at the Beginning**: Add a new node at the start of the list.
- **Insertion at the End**: Add a new node at the end of the list.
- **Creation of Circular List**: Initialize the list with a predefined set of nodes forming a circle.
- **Print List**: Print all nodes in the list starting from the node next to the last node until it reaches back to the last node.
- **Length**: Count the number of nodes in the list.
- **Check if Empty**: Determine if the list is empty.
- **Remove Last Node**: Remove the node at the end of the list.

### Usage

The main method demonstrates the following operations:
1. Creating a circular linked list with a predefined set of nodes.
2. Inserting nodes at the beginning of the list.
3. Inserting nodes at the end of the list.
4. Removing the last node of the list.
5. Printing the contents of the list.
6. Counting the number of nodes in the list.
7. Checking if the list is empty.

## How to Use

1. **Clone the Repository**: 
   ```bash
   git clone https://github.com/Dikshant23529/DSA
   cd DSA
   ```

2. **Compile and Run:**: 

    Ensure you have Java installed on your machine.

    Navigate to the directory containing the Java files.

    i. Compile the Files  
     ```bash
     javac SinglyLinkedList.java
     javac CircularSinglyLinkedList.java
     ```

    ii. Run the Classes
     ```bash  
     java SinglyLinkedList
     java CircularSinglyLinkedList
     ```
 
## Conclusion

These implementations serve as a fundamental introduction to linked lists and their variations. Understanding these data structures and their operations is crucial for anyone studying data structures and algorithms. The provided code is a starting point, and you are encouraged to extend and optimize these implementations for various use cases.