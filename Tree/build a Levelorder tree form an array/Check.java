import java.util.*;

public class Check {
    public static TreeNode constructBinaryTree(int[] arr) {
        if (arr == null || arr.length == 0) { // Agar array null ya khali hai
            return null; // Return null (koi tree nahi banega)
        }

        TreeNode root = new TreeNode(arr[0]); // Root node banaya pehle element se
        Queue<TreeNode> q = new LinkedList<>(); // Ek queue banayi nodes ko track karne ke liye
        q.offer(root); // Root node ko queue mein add kiya

        int i = 1; // Index ko set kiya second element ke liye
        while (!q.isEmpty() && i < arr.length) { // Jab tak queue khali nahi hoti aur array mein elements hain
            TreeNode current = q.poll(); // Queue se ek node nikal kar current node banayi

            // Agar next element array mein hai aur valid hai
            if (i < arr.length && arr[i] != -1) {
                current.left = new TreeNode(arr[i]); // Left child banaya
                q.offer(current.left); // Left child ko queue mein add kiya
            }
            i++; // Index badhaya

            // Agar next element array mein hai aur valid hai
            if (i < arr.length && arr[i] != -1) {
                current.right = new TreeNode(arr[i]); // Right child banaya
                q.add(current.right); // Right child ko queue mein add kiya
            }
            i++; // Index badhaya
        }

        return root; // Root node return kiya
    }

    public static void levelorder(TreeNode root) {
        if (root == null) { // Agar root null hai
            return; // Kuch nahi karna
        }

        Queue<TreeNode> q = new LinkedList<>(); // Ek nayi queue banayi traversal ke liye
        q.offer(root); // Root node ko queue mein add kiya

        while (!q.isEmpty()) { // Jab tak queue khali nahi hoti
            TreeNode current = q.poll(); // Queue se ek node nikal kar current node banayi
            System.out.print(current.val + " "); // Current node ka value print kiya

            if (current.left != null) { // Agar current node ka left child hai
                q.offer(current.left); // Left child ko queue mein add kiya
            }
            if (current.right != null) { // Agar current node ka right child hai
                q.offer(current.right); // Right child ko queue mein add kiya
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Check the shit"); // Testing message
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array
        TreeNode root = constructBinaryTree(arr); // Binary tree construct kiya
        System.out.println("Root node value: " + root.val); // Root node ka value print kiya
        System.out.println("Level order traversal of the constructed tree: ");
        levelorder(root); // Tree ka level order traversal print kiya
    }
}

class TreeNode {
    int val; // Node ka value
    TreeNode left, right; // Left aur right child pointers

    public TreeNode(int val) {
        this.val = val; // Node ka value set kiya
        this.left = null; // Initially left child null hai
        this.right = null; // Initially right child null hai
    }
}
