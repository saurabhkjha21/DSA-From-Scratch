package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        Queue<Node1> queue = new LinkedList<>();
        Node1 root = new Node1(0);
        root.left = new Node1(1);
        root.right= new Node1(2);
        root.left.left = new Node1(3);
        root.left.right = new Node1(4);
        root.left.left.left= new Node1(5);

        System.out.print("Inorder Traversal: ");
        inOrder(root);
        System.out.println();
        TreeTraversal obj = new TreeTraversal();
        System.out.println("Max Depth: "+obj.maxDepth(root));


    }
     static class Node1{
        int data;
        Node1 right, left;
        Node1(int data){
            this.data=data;
            left=right=null;
        }

    }
    public static void inOrder(Node1 node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+"->");
        inOrder(node.right);
    }
    public int maxDepth(Node1 root) {
        if(root==null) return 0;
        int lLength = maxDepth(root.left);
        int rLength = maxDepth(root.right);
        return Math.max(lLength, rLength) + 1;
    }

}
