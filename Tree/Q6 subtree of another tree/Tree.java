import java.util.*;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node buildTree(int[] nodes) {
        if (nodes == null || nodes.length == 0) return null;
        Node root = new Node(nodes[0]);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < nodes.length) {
            Node current = q.poll();
            if (nodes[i] != -1) {
                current.left = new Node(nodes[i]);
                q.offer(current.left);
            }
            i++;
            if (i < nodes.length && nodes[i] != -1) {
                current.right = new Node(nodes[i]);
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static void printAll(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");
            if (current.left != null) q.add(current.left);
            if (current.right != null) q.add(current.right);
        }
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        // Fixed duplicate check on left subtrees, changed to check right subtree
        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static void main(String[] args) {
        System.out.println("Check if one tree is subtree of another");
        int rootTreeArray[] = {1, 2, 3, 4, 5, -1, 6};
        int subRootTreeArray[] = {2, 4, 5};
        Node root = buildTree(rootTreeArray);
        Node subRoot = buildTree(subRootTreeArray);
        System.out.print(isSubtree(root, subRoot));
    }
}
