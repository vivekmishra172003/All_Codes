class Solution {
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while(temp != null){
            temp.data = temp.data+carry;
            if(temp.data <10){
                carry =0;
                break;
            }else{
                temp.data =0;
                carry =1;
            }
            temp = temp.next;
        }
        if(carry == 1){
            Node newNode = new Node(carry);
            head = reverse(head);
            newNode.next = head;
            head = newNode;
            return head;
        }
        return    reverse(head);
    }
    public static Node reverse(Node head){
        Node previous = null;
        Node front;
        Node temp = head;
        while(temp != null){
            front = temp.next;
            temp.next = previous;
            previous = temp;
            temp = front;
        }
        return previous;
    }
    
}