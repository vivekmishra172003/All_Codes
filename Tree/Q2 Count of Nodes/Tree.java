import java.util.*;

public class Tree {
    // Method to build a binary tree from an array representation
    public static TreeNode buildTree(int[] arr) {
        if (arr == null || arr.length == 0) { // Check if the array is null or empty
            return null; // Return null if the array is empty or null
        }
        TreeNode root = new TreeNode(arr[0]); // Create the root node with the first element of the array
        Queue<TreeNode> q = new LinkedList<>(); // Initialize a queue to help with level order insertion
        q.offer(root); // Add root to the queue
        int i = 1; // Start from the second element of the array

        // Loop to construct the tree using level order traversal
        while (!q.isEmpty() && i < arr.length) { // Continue while the queue is not empty and there are elements in the array
            TreeNode current = q.poll(); // Remove the front node from the queue
            
            // Check and add the left child
            if (i < arr.length && arr[i] != -1) { // Ensure the index is within bounds and the element is not -1
                current.left = new TreeNode(arr[i]); // Create the left child node
                q.offer(current.left); // Add the left child to the queue
            }
            i++; // Move to the next element in the array
            
            // Check and add the right child
            if (i < arr.length && arr[i] != -1) { // Ensure the index is within bounds and the element is not -1
                current.right = new TreeNode(arr[i]); // Create the right child node
                q.offer(current.right); // Add the right child to the queue
            }
            i++; // Move to the next element in the array
        }
        return root; // Return the root of the tree
    }

    // Method to count the number of nodes in the tree
    public static int CountNode(TreeNode root) {
        if (root == null) { // Check if the current node is null
            return 0; // Return 0 if the tree is empty
        }
        // Count nodes recursively: 1 (current node) + left subtree count + right subtree count
        return 1 + CountNode(root.left) + CountNode(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Check"); // Print a check message
        int[] arr = {1, 2, 3, 4, 5, -1, 6}; // Define an array to represent the tree
        TreeNode root = buildTree(arr); // Build the tree from the array
        System.out.println(root.val); // Print the value of the root node
        int c = CountNode(root); // Count the number of nodes in the tree
        System.out.println(c); // Print the count of nodes
    }
}

// TreeNode class definition
class TreeNode {
    int val; // Value of the node
    TreeNode left, right; // Left and right children of the node

    // Constructor to initialize the node value
    TreeNode(int val) {
        this.val = val; // Set the value of the node
        this.left = null; // Initialize left child as null
        this.right = null; // Initialize right child as null
    }
}
