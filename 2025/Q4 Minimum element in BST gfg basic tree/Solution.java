class Solution {
    // Function to find the minimum element in the given BST.
    
    int minValue(Node root) {
        // code here
        if(root == null){
            return -1;
        }
        Node curr = root;
        while(curr.left != null){
            curr = curr.left;
        }
        return curr.data;
    }
}