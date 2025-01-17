import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node BSTtree(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = BSTtree(root.left, data);
        } else {
            root.right = BSTtree(root.right, data);
        }
        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        System.out.println("ram ram");
        int[] arr = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = BSTtree(root, arr[i]);
        }

        // Perform an inorder traversal to check if the BST is built correctly
        System.out.println("Inorder Traversal of the BST:");
        inorderTraversal(root);
    }
}
