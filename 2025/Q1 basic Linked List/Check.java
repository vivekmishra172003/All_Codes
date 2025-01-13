class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        // base case agar head hi null hua to hum ye karenge
       if (head == null) {
            return new Node(x);
        }
        // Node current = head;
               // Traverse the list to find the last node.
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Add the new node at the end.
        current.next = new Node(x);
        return head;
    }
}

// https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1?page=1&category=Linked%20List&difficulty=Basic&sortBy=submissions