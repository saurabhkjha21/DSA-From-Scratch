package Tree;

import com.sun.source.tree.WhileLoopTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void main(String[] args) {
        Queue<Node> queue = new LinkedList<>();

        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        System.out.print("Inorder: ");
        inOrder(root);
        System.out.println();
        System.out.print("Preorder: ");
        preOrder(root);
        System.out.println();
        System.out.print("Postorder: ");
        postOrder(root);


    }
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public static void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public static void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");

    }

}
