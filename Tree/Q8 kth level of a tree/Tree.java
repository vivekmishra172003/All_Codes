import java.util.*;

public class Tree {
    // Nested class for the tree nodes
    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Method to build the tree from an array
    public static TreeNode buildTree(int[] nodes) {
        if (nodes == null || nodes.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(nodes[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;

        while (!q.isEmpty() && i < nodes.length) {
            TreeNode current = q.poll();

            if (i < nodes.length && nodes[i] != -1) {
                current.left = new TreeNode(nodes[i]);
                q.offer(current.left);
            }
            i++;

            if (i < nodes.length && nodes[i] != -1) {
                current.right = new TreeNode(nodes[i]);
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }

    // Method to print the k-th level of the tree
    public static void printKthLevel(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    TreeNode current = q.poll();
                    System.out.print(current.data + " ");
                }
                return; // Exit after printing the k-th level
            }
            for (int i = 0; i < size; i++) {
                TreeNode current = q.poll();
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, -1, 4, 5, 6};
        TreeNode root = buildTree(nodes);

        // Print the k-th level of the tree
        int k = 2;
        System.out.println("Nodes at level " + k + ":");
        printKthLevel(root, k);
    }
}
