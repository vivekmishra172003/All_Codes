import java.util.*;
public class Tree{
    static class TreeNode{
        int data;
        TreeNode left,right;
        public TreeNode(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
        public static TreeNode buildTree(int[] nodes){
            if(nodes == null || nodes.length == 0){
                return null;
            }
            TreeNode root = new TreeNode(nodes[0]);
            int i =1;
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty() && i<nodes.length){
                TreeNode current = q.poll();
                if(i<nodes.length && nodes[i]!=-1){
                    current.left = new TreeNode(nodes[i]);
                    q.offer(current.left);
                }
                i++;
                if(i<nodes.length && nodes[i]!=-1){
                    current.right = new TreeNode(nodes[i]);
                    q.offer(current.right);
                }
                i++;
            }
            return root;
        }
        public static void printK(TreeNode root,int k ){
            if(root == null ){
                return;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int level =1;
            while(!q.isEmpty()){
                TreeNode current = q.poll();
                if(current.left != 0 ){
                    q.offer(current.left);}
                }
                if(current.right != 0 && i==k){
                    q.offer(current.left);
                }
                if(i==k){
                    return;
                }
                i++;
            }
        }
    public static void main(String[] args){
        System.out.print("Check it");
        int[] nodes = {1,2,3,4,5,6,7};
        int k =3;
        TreeNode root = buildTree(nodes);
        System.out.println(root.data,k);
        printK(root);
    }
}