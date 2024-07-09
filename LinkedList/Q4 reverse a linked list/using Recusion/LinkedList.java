import java.util.*;
public class LinkedList{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printAll(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public Node reverseListRecursive(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args){
        // int nodes = {1,2,3,4,5};
        LinkedList ll = new LinkedList();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printAll();
        head = ll.reverseListRecursive(head);
        ll.printAll();

    }
}