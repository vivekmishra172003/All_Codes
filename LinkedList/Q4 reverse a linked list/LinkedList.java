import java.util.*;

public class LinkedList {
    // Node class to represent each element in the LinkedList
    static class Node {
        int data;
        Node next;
        
        // Constructor to initialize the node with data
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Head of the LinkedList
    public static Node tail; // Tail of the LinkedList

    // Method to add a node at the beginning of the LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            head = tail = newNode;
            return;
        }
        newNode.next = head; // Point new node to the current head
        head = newNode; // Make the new node the head
    }

    // Method to print all the elements of the LinkedList
    public void printAll() {
        if (head == null) { // If the list is empty
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // Print current node's data
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // For a new line after printing all elements
    }

    // Iterative approach to reverse the LinkedList
    public void reverseL() {
        if (head == null) { // If the list is empty
            return;
        }
        Node prev = null; // Previous node, initially null
        Node current = head; // Current node starts from head
        Node next = null; // Next node to be processed

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to the current node
            current = next; // Move current to the next node
        }
        head = prev; // Update the head to the new front
    }

    public static void main(String[] args) {
        System.out.println("Check it");
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printAll(); // Prints: 1 2 3 4 5 
        ll.reverseL();
        ll.printAll(); // Prints: 5 4 3 2 1 
    }
}
