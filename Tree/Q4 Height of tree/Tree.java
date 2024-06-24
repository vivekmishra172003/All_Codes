import java.util.*;
public class Tree{
    public static TreeNode buildTree(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i =1;
        while(!q.isEmpty() && i<arr.length){
            TreeNode current = q.poll();
            if(arr[i]!=-1){
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
            }
            i++;
            if(i<arr.length && arr[i]!=-1){
                current.right = new TreeNode(arr[i]);
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }
    public static int HeightofTree(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(HeightofTree(root.left),HeightofTree(root.right))+1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,-1,-1,9,-1,-1,6,-1,7};
        TreeNode root = buildTree(arr);
        System.out.println(root.val);
        int h = HeightofTree(root);
        System.out.println(h);
    }
}
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode (int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}