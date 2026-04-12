//235. Lowest Common Ancestor of a Binary Search Tree - LeetCode
//TC = O(n)
//SC = O(H)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        

        //both are not null -> means LCA
        if(left !=null && right != null){
            return root;
        }

        return (left!=null) ? left : right;
        
    }
}
