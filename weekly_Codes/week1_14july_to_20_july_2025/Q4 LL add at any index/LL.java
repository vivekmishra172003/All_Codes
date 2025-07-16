// Q print a LL with addFist addLast and pritnall in Linkedlist
// /******************************************************************************

//                             Online Java Compiler.
//                 Code, Compile, Run and Debug java program online.
// Write your code in this editor and press "Run" button to execute it.

// *******************************************************************************/

public class LL
{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }
    public void addLast(int data){
          Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
            tail = newNode;
    }
    public void Printall(){
        if(head == null){
            System.out.println("this is null");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		LL ll = new LL();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addLast(4);
		ll.Printall();
		
	}
}