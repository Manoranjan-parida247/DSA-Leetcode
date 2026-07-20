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
        //both on left 
        //both on right 
        // one in left and another one in right --> ans: curr node
        //one of them is current node --> ans: curr node
        
        if(root == null) return null;

        int curr = root.val;

        if(p.val < curr && q.val < curr){
            return lowestCommonAncestor(root.left, p, q);
        }

        if(p.val > curr && q.val > curr){
            return lowestCommonAncestor(root.right, p, q);
        }

        return root;
    }
}