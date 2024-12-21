import java.util.*;

public class CustomLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the linked list
    public void pl() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data); // Print the data of the current node
            currentNode = currentNode.next; // Move to the next node
        }
    }

    public static void main(String[] args) {
        System.out.println("Message");
        CustomLinkedList ll = new CustomLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);

        // Print the linked list
        ll.pl();
    }
}
