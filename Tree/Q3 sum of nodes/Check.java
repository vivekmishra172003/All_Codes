import java.util.*;
public class Check{
    public static TreeNode buildTree(int[] arr){
        if(arr == null || arr.length == -1){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i =1;
        while(!q.isEmpty() && i<arr.length){
            TreeNode current = q.poll();
            if(arr[i] != -1){
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
            }
            i++;
            if(arr[i] != -1 && i<arr.length){
                current.right = new TreeNode(arr[i]);
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }
    public static int SumNode(TreeNode root){
        if(root == null){
            return 0;
        }

        return root.val + SumNode(root.left)+SumNode(root.right);
    }
    public static void main(String[] args){
        System.out.println("Check");
        int[] arr = {1,2,3,4,5,-1,6};
        TreeNode root = buildTree(arr);
        System.out.println(root.val);
        int sum = SumNode(root);
        System.out.println(sum);
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}