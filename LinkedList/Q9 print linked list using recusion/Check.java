import java.util.*;
public class Check{
    static class Node{
        int data; Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void display(Node current){
        if(current == null){
            return;
        }
        display(current.next);
        if(current.data <9){
        System.out.println(current.data);
        }
    }
    public static void main(String[] args){
        add(1);
        add(2);
        add(3);
        // add(40);
        Node current = head;
        display(current);

}
}

