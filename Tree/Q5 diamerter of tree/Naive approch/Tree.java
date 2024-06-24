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
        while(i<arr.length && !q.isEmpty()){
            TreeNode current = q.poll();
            if(arr[i]!=-1){
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
            }
            i++;
            if(arr[i]!=-1 && i<arr.length){
                current.right =  new TreeNode(arr[i]);
                q.offer(current.right);
            }
            i++;
        }
        return root;
    }
    public static int findHeight(TreeNode root){
        if(root ==  null){
            return 0;
        }
        return Math.max(findHeight(root.left),findHeight(root.right))+1;
    }
    public static int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh =  findHeight(root.left);
        int rh =  findHeight(root.right);
        int sd = lh +rh +1;
        return Math.max(sd,Math.max(ld,rd));
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        TreeNode root = buildTree(arr);
        System.out.println(root.val);
        int h = findHeight(root);
        System.out.println(h);
        int d =  diameter(root);
        System.out.println(d);
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