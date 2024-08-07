import java.util.*;
public class Check{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root,int[] num){
        if(root == null){
            root = new Node(num)
        }
    }

    public static void main(String[] args){
        System.out.print("Check it");
        int num[] = {5,1,3,4,2,7};
        Node root = null;
        root = insert(root,num);
    }
}