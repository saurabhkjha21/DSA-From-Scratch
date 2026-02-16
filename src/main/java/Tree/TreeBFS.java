package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void levelOrder(Node root){
        if(root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data+" ");

            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        levelOrder(root);

    }
}
