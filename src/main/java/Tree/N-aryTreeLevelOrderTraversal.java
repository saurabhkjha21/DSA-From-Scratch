//429. N-ary Tree Level Order Traversal - LeetCode
//TC = O(n)
//SC = O(n)

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {    
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0; i<size; i++){
                Node current = q.poll();
                level.add(current.val);
                for(Node e : current.children){
                    if(e!=null) q.offer(e);

                }

            }
            result.add(level);
        }
        return result;
        
    }
}
