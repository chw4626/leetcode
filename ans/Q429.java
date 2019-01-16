/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return res;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> tep = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node node = q.poll();
                tep.add(node.val);
                for(Node c : node.children)
                    q.offer(c);
            }
            res.add(tep);
        }
        return res;
        
    }
}