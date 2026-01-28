package Tree;

public class BinaryTreeDemo {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data=data;
            left=right=null;
        }

    }
    public static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node node = new Node(5);
        node.left = new Node(4);
        node.right = new Node(5);
        System.out.println("Tree Created:");
        inOrder(node);
    }
}
