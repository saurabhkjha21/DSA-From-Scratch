package Tree;

public class TreeBFSRecursion {
    public static void main(String[] args) {
        Node root=null;
        root = insertion(root, 5);
        root = insertion(root,1);
        root = insertion(root, 7);
        root = insertion(root, 3);
        levelOrder(root);

    }
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static void levelOrder(Node root) {
        if (root == null) return;

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }

    }
    public static Node insertion(Node root, int data){
        if(root==null) return new Node(data);
        if(data<root.data){
            root.left=insertion(root.left, data);
        }
        else{
            root.right=insertion(root.right, data);
        }
        return root;
    }
}
