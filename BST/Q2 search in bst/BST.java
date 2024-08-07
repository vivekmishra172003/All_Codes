import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Function to insert a node in the BST
    public static Node insert(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Function to insert all elements of the array into the BST
    public static Node insertAll(Node root, int[] num, int n) {
        for (int i = 0; i < n; i++) {
            root = insert(root, num[i]);
        }
        return root;
    }

    // Function to print the BST (Inorder traversal)
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        System.out.println("check");
        int num[] = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        int n = num.length;
        Node root = null;
        if (n != 0) {
            // Call insertAll to insert all elements into the BST
            root = insertAll(root, num, n);
        }

        // Print the BST to verify
        inorder(root);
    }
}
