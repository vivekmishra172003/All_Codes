import java.util.*;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Removed static from head and tail to make them instance variables
    public Node head;
    public Node tail;

    // Removed static from addLast method
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Removed static from printList method
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int lSize(){
        if(head == null ){
            return 0;
        }
        Node temp = head;
        int k =0;
        while(temp!=null){
            k++;
            temp = temp.next;
        }
        return k;
    }
    public void FRL(int size,int r){
        int f = size-r+1; // hume fornt se ye node remove karni hai
        int i =1;
        Node temp = head;
        while(i<f-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        int k = ll.lSize();
        System.out.print("Linked list: ");
        ll.printList(); 
        System.out.println(k);
        ll.FRL(k,3);
        ll.printList(); 
    }
}
