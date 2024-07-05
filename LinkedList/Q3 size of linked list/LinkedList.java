import java.util.*;

public class LinkedList {
    // Definition of Node class
    public static class Node {
        int data;
        Node next;

        // Constructor for Node class
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail pointers
    public static Node head;
    public static Node tail;

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Method to print all elements in the list
    public void pAll() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Method to get the size of the list
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Corrected method to print the size of the list
    public void psize() {
        System.out.println("Size of the list: " + size());
    }

    // Method to remove the first element of the list
    public void RemoveFirst() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    // Method to remove the last element of the list
    public void RemoveLast() {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    // Method to remove a node at a specific index
    public void RemoveAtIndex(int index) {
        if (index < 0 || index >= size()) {
            return;
        }
        if (index == 0) {
            RemoveFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Check");
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.pAll();
        
        // Corrected call to print the size of the list
        ll.psize();
        
        // Remove first element
        ll.RemoveFirst();
        
        // Remove last element
        ll.RemoveLast();
        
        // Remove node at index 1
        ll.RemoveAtIndex(1);
        
        // Print all elements in the list
        ll.pAll();
    }
}
