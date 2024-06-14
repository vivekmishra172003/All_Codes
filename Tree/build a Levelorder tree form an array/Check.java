import java.util.*;
public class Check{
    public static TreeNode constructBinaryTree(int[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i =1;
        while(!q.isEmpty() && i<arr.length){
            int current = q.poll();
            if(i<arr.length && arr[i] != -1){
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
            }
            i++;
            if(i<arr.length && arr[i] != -1){
                current.right= new TreeNode(arr[i]);
                q.offer(current.right);
                i++;
            }
            return root;
        }
    }
    public static void main(String[] args){
        System.out.println("Check the shit");
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = constructBinaryTree(arr);
        System.out.println(root.data);
    }
}

class TreeNode{
    int data;
    int left;
    int right;
    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}