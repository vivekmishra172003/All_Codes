class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> arr = new ArrayList<>();
        preorderUtil(root, arr);
        return arr;
    }
    public static void preorderUtil(Node root,ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        arr.add(root.data);
        preorderUtil(root.left, arr);
        preorderUtil(root.right, arr);
    }
    
}