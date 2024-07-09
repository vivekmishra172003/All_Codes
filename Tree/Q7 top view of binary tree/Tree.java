import java.util.*;

public class Tree {
    static class TreeNode { // Define the TreeNode class
        int data; // Data in the node
        TreeNode left, right; // Left and right children
        public TreeNode(int data) { // Constructor for TreeNode
            this.data = data; // Set data
            this.left = this.right = null; // Initialize children as null
        }
    }

    public static TreeNode buildTree(int[] nodes) { // Method to build tree from array
        if (nodes == null || nodes.length == 0) { // Check if array is empty
            return null; // Return null if empty
        }
        TreeNode root = new TreeNode(nodes[0]); // Create root node
        Queue<TreeNode> q = new LinkedList<>(); // Queue for level order construction
        q.offer(root); // Add root to queue
        int i = 1; // Index for array
        while (!q.isEmpty() && i < nodes.length) { // Loop until queue is empty or end of array
            TreeNode current = q.poll(); // Get and remove front node from queue
            if (nodes[i] != -1 && i < nodes.length) { // Check if left child exists
                current.left = new TreeNode(nodes[i]); // Create left child
                q.offer(current.left); // Add left child to queue
            }
            i++; // Increment index
            if (i < nodes.length && nodes[i] != -1) { // Check if right child exists
                current.right = new TreeNode(nodes[i]); // Create right child
                q.offer(current.right); // Add right child to queue
            }
            i++; // Increment index
        }
        return root; // Return root of the tree
    }

    // Method for level order traversal
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) { // Check if tree is empty
            return; // Return if empty
        }
        Queue<TreeNode> q = new LinkedList<>(); // Queue for level order traversal
        q.offer(root); // Add root to queue
        while (!q.isEmpty()) { // Loop until queue is empty
            TreeNode current = q.poll(); // Get and remove front node from queue
            System.out.print(current.data + " "); // Print current node data
            if (current.left != null) { // Check if left child exists
                q.offer(current.left); // Add left child to queue
            }
            if (current.right != null) { // Check if right child exists
                q.offer(current.right); // Add right child to queue
            }
        }
    }

    // Method for top view of the tree
    // public static void topView(TreeNode root) {
    //     if (root == null) { // Check if tree is empty
    //         return; // Return if empty
    //     }

    //     class QueueItem { // Helper class for queue items
    //         TreeNode node; // Tree node
    //         int hd; // Horizontal distance

    //         QueueItem(TreeNode n, int h) { // Constructor
    //             node = n; // Set node
    //             hd = h; // Set horizontal distance
    //         }
    //     }

    //     Map<Integer, Integer> topViewMap = new TreeMap<>(); // Map to store top view nodes
    //     Queue<QueueItem> q = new LinkedList<>(); // Queue for level order traversal
    //     q.offer(new QueueItem(root, 0)); // Add root to queue with horizontal distance 0

    //     while (!q.isEmpty()) { // Loop until queue is empty
    //         QueueItem qi = q.poll(); // Get and remove front item from queue
    //         int hd = qi.hd; // Get horizontal distance
    //         TreeNode node = qi.node; // Get node

    //         if (!topViewMap.containsKey(hd)) { // Check if horizontal distance is not in map
    //             topViewMap.put(hd, node.data); // Add node data to map
    //         }

    //         if (node.left != null) { // Check if left child exists
    //             q.offer(new QueueItem(node.left, hd - 1)); // Add left child to queue with horizontal distance -1
    //         }

    //         if (node.right != null) { // Check if right child exists
    //             q.offer(new QueueItem(node.right, hd + 1)); // Add right child to queue with horizontal distance +1
    //         }
    //     }

    //     for (Map.Entry<Integer, Integer> entry : topViewMap.entrySet()) { // Loop through map entries
    //         System.out.print(entry.getValue() + " "); // Print node data
    //     }
    // }
    public static void topView(TreeNode root){
        if(root == null){
            return;
        }
        class QueueItem{
            TreeNode node;
            int hd;
            QueueItem(TreeNode n,int h){
                node =n;
                hd=h;
            }
        }
        Map<Integer,Integer> topViewMap = new TreeMap<>();
        Queue<QueueItem> q = new LinkedList<>();
        q.offer(new QueueItem(root,0));
        while(!q.isEmpty()){
            QueueItem qi = q.poll();
            int hd = qi.hd;
            TreeNode node = qi.node;
            if(!topViewMap.containsKey(hd)){
                topViewMap.put(hd,node.data);
            }
            if(node.left != null){
                q.offer(new QueueItem(node.left,hd-1));
            }
            if(node.right != null){
                q.offer(new QueueItem(node.right,hd+11));
            }
        }
               for (Map.Entry<Integer, Integer> entry : topViewMap.entrySet()) { // Loop through map entries
            System.out.print(entry.getValue() + " "); // Print node data
        }
    }

    public static void main(String[] args) {
        System.out.println("Check it"); // Print message
        int[] nodes = {1, 2, 3, -1, 4, -1, -1, -1, 5, -1, 6}; // Array of node values
        TreeNode root = buildTree(nodes); // Build tree from array
        System.out.println("Level Order Traversal:"); // Print message
        levelOrderTraversal(root); // Perform level order traversal
        System.out.println("\nTop View:"); // Print message
        topView(root); // Print top view of the tree
    }
}
