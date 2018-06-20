/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
public Stack<TreeNode> s = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        
        while (root!= null){
            s.push(root);
            root = root.left;
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = s.pop();
        
        TreeNode cur = node.right;
        while(cur!= null){
            s.push(cur);
            cur = cur.left;
        }
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */