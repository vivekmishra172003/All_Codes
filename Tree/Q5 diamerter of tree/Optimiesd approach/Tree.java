import java.util.*;
public class Tree{
    public  static TreeNode buildTree(int[] arr){
        if(arr == null || arr.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        int i =1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty() && i<arr.length){
            TreeNode current = q.poll();
            if(arr[i] != -1){
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
            }
            i++;
            if(arr[i] != -1 && i<arr.length){
                current.left = new TreeNode(arr[i]);
                q.offer(current.left);
            }
            i++;
        }
        return root;
    }
    public static int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
    return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }
    public static int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        HeightAndDiameter hd = calculateHeightAndDiameter(root);
        return hd.diameter;
    }
    private static class HeightAndDiameter{
        int height;
        int diameter;
        public  HeightAndDiameter(int height,int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    
    private static HeightAndDiameter calculateHeightAndDiameter(TreeNode node){
        if(node == null){
            return new HeightAndDiameter(0,0);
        }
        HeightAndDiameter left=( calculateHeightAndDiameter(node.left));
        HeightAndDiameter right = (calculateHeightAndDiameter(node.right));
        int height = Math.max(left.height+right.height);
        int diameterThroughNode = left.height+right.height+1;
        int diameter =  Math.max(diameterThroughNode,Math.max(left.diameter,right.diameter))
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,-1,6};
        TreeNode root = buildTree(arr);
        System.out.println(root.val);
        int h = 
        int d = diameter(root);
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