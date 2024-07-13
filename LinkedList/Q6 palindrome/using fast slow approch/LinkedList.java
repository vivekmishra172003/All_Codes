import java.util.*;
public class LinkedList {
    // Node class to represent each element in the LinkedList
    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head;
    public Node tail;

    // Method to add an element at the end of the LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Method to print all elements of the LinkedList
    public void printall() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Method to find the middle node of the LinkedList
    public Node findMid() {
        if (head == null) {
            return null; // Corrected return type to Node
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) { // Corrected the condition
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to check if the LinkedList is a palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid(); // Corrected the method call to findMid
        // reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while (right != null) { // Corrected condition to compare till right is not null
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Corrected position of initialization
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printall();
        System.out.println("Is Palindrome: " + ll.isPalindrome()); // Added proper message
    }
}
