import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
             // then hum left subtree ke me insert karenge
            root.left = insert(root.left,val);
        } else{
            //right subtree me ghusa denge
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args){
        System.out.println("check it again");
        int values[] = {5,1,3,4,2,7};
        Node root = null;
        for(int i : values ){
            root = insert(root,i);
        }
        inorder(root);
    }
    
}

// comment added with hellp of chat gpt
/*import java.util.*;

public class BST {
    // Node class representing each node in the BST
    static class Node {
        int data; // Data stored in the node
        Node left; // Left child
        Node right; // Right child

        // Constructor to initialize a new node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method to insert a value into the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val); // Create a new node if the tree is empty
            return root;
        }
        if (root.data > val) {
            // Insert into the left subtree if the value is smaller
            root.left = insert(root.left, val);
        } else {
            // Insert into the right subtree if the value is greater
            root.right = insert(root.right, val);
        }
        return root; // Return the updated root
    }

    // In-order traversal of the BST
    public static void inorder(Node root) {
        if (root == null) {
            return; // Base case: if the tree is empty, do nothing
        }
        inorder(root.left); // Visit the left subtree
        System.out.println(root.data + " "); // Print the current node's data
        inorder(root.right); // Visit the right subtree
    }

    public static void main(String[] args) {
        System.out.println("Building and traversing the BST...");
        int values[] = {5, 1, 3, 4, 2, 7}; // Array of values to insert into the BST
        Node root = null; // Initialize the root of the BST

        // Insert values into the BST
        for (int i : values) {
            root = insert(root, i);
        }

        // Corrected: Call the inorder method inside the main method
        inorder(root);
    }
}
 */