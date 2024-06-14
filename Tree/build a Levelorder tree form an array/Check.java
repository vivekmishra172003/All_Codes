import java.util.*;
class TreeNode{
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public static TreeNode constructBinaryTree(int[] arr){
    if(arr=null || arr.length ==0){
        return null;
    }
    TreeNode root = new TreeNode(arr[0]);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int i =1;
    while(!queue.isEmpty() && i<arr.length){
        TreeNode current = queue.poll();
        if(i<arr.length && arr[i] != -1){
            current.left = new TreeNode(arr[i]);
            queue.offer(current.left);
        }
        i++;
        if(i<arr.length && arr[i] != -1){
            current.right = new TreeNode(arr[i]);
            queue.offer(current.right);
        }
        i++;
    }
    return root;
}
public class Check{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        TreeNode root = constructBinaryTree(arr);
                // Output the constructed tree using level order traversal
        System.out.print("Level order traversal of the constructed tree: ");
        levelOrderTraversal(root);
    }
}