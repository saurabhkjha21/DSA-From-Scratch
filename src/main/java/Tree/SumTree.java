//Sum Tree - GFG
//Time Complexity = O(n)
//Space Complexity = O(h)


/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        
        return helper(root)!=-1;
        
    }
    int helper(Node root){
        //root is null
        if(root==null) return 0;
        
        //leaf node
        if(root.left==null && root.right==null){
            return root.data;
        }
        
        int leftSum = helper(root.left);
        int rightSum= helper(root.right);
        
        //invalid subtree
        if(leftSum==-1 || rightSum==-1){
            return -1;
        }
        
        //check dum
        if(root.data != leftSum + rightSum){
            return -1;
        }
        //return total sum
        
        return root.data + leftSum + rightSum;
    }
}
