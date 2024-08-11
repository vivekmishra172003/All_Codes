import java.util.*;

public class Check {

    // Node class to represent each element in the linked list
    public static class Node {
        int data;       // Data stored in the node
        Node next;      // Reference to the next node in the list
        
        // Constructor to create a new node with the given data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Reference to the first node in the linked list
    public static Node tail; // Reference to the last node in the linked list

    // Method to add a new node with the given data to the end of the linked list
    public static void add(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        
        // If the list is empty, both head and tail will point to the new node
        if (head == null) {
            head = tail = newNode;
        } else {
            // If the list is not empty, add the new node to the end and update the tail
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to display the linked list
    public static void display() {
        // If the list is empty, return without printing anything
        if (head == null) {
            return;
        }
        
        // Traverse the linked list and print each node's data
        Node current = head; // Start from the head node
        while (current != null) {
            System.out.print(current.data + " "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Move to the next line after printing all nodes
    }

    // Method to rotate the linked list to the right by k positions
    public static void rotate() {
        int k = 4; // Number of positions to rotate the list
        
        // If the list is empty or no rotation is needed, return
        if (head == null || k == 0) {
            return;
        }

        // Step 1: Find the length of the linked list
        Node current = head; // Start from the head node
        int length = 1; // Initialize length to 1 since we're starting from head
        while (current.next != null) {
            length++; // Increment length as we traverse the list
            current = current.next; // Move to the next node
        }
        
        // Step 2: Make the linked list circular by connecting the last node to the head
        current.next = head;

        // Step 3: Calculate the new head position after rotation
        k = k % length; // Ensure k is within the bounds of the list length
        int stepsToNewHead = length - k; // Calculate the number of steps to the new head
        
        // Step 4: Find the new tail and head
        for (int i = 0; i < stepsToNewHead; i++) {
            current = current.next; // Move to the new tail node
        }
        
        // Step 5: Set the new head and break the circular link
        head = current.next; // The node after the new tail becomes the new head
        current.next = null; // Break the link to make the list linear again
    }

    public static void main(String[] args) {
        System.out.println("check"); // Print a message to indicate the start of the program

        // Add nodes to the linked list
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        add(60);

        display(); // Display the original linked list
        
        rotate();  // Rotate the linked list by k positions
        
        display(); // Display the rotated linked list
    }
}
