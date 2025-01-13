import java.util.*;
public class CheckR2{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        public static void po(Node rootNode){
            if(rootNode == null){
                return;
            }
            System.out.println(rootNode.data);
            po(rootNode.left);
            po(rootNode.right);
        }
    }
    public static void  main(String[] args){
        System.out.println("Check it now");
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node rootNode = tree.buildTree(nodes);
        System.out.println(rootNode.data);
        tree.po(rootNode);
    }
}
// mera man kar aha hai ki mai 45 min bhi na padu agar mai isse kar lunga to mai kuch to karib aa hi jaaug apne gaola ke aur kal kuch aage se hi shur karunga karna 