import java.util.*;

public class Check {
    // Defining the Node class inside the Check class
    static class Node {
        int data; // The data stored in the node
        Node next; // Pointer to the next node in the linked list

        // Constructor to initialize the node with data and set next to null
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail of the linked list
    public static Node head = null;
    public static Node tail = null;

    // Method to add a node to the linked list
    public static void addNode(int data) {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // If the list is empty, the new node becomes the head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, add the new node to the end of the list
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to display the linked list
    public static void display() {
        // Start from the head node
        Node current = head;

        // Traverse the list and print each node's data
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Print a newline at the end
    }

    public static void rotate(int k){
        if (head == null || k == 0) { // Edge cases: empty list or no rotation needed
            return;
        }
        // Calculate the length of the linked list
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return;
        }
        current.next = head;
    }

    public static void main(String[] args) {
        // Adding nodes to the linked list
        addNode(10);
        addNode(20);
        addNode(30);
        addNode(40);

        // Displaying the linked list
        System.out.print("Linked list: ");
        display();

        rotate(3);
    }
}
