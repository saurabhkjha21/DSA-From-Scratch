//662. Maximum Width of Binary Tree - LeetCode
//Time Complexity=O(N)
//Space Complexity=O(N)


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth=0;

        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().index;
            
            int first=0, last=0;
            for(int i=0; i<size; i++){
                Pair p = q.poll();
                TreeNode node = p.node;
                int index = p.index - min;

                if(i==0) first=index;
                if(i==size-1) last = index;

                if(node.left!=null){
                    q.offer(new Pair(node.left, 2*index+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right, 2*index+2));
                }
            }
            maxWidth=Math.max(maxWidth, last-first+1);
            
        }
        return maxWidth;
        
    }
    
}
class Pair{
    int index;
    TreeNode node;
    Pair(TreeNode node, int index){
        this.node=node;
        this.index=index;
    }
}
