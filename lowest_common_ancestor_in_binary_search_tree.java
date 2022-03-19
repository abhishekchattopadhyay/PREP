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
        if ( root == null) {
            return null;
        }
        TreeNode l = null;
        TreeNode r = null;
        if(root.val < Math.min(p.val, q.val)) {
            l = lowestCommonAncestor(root.right, p, q);
        }
        else if(root.val > Math.max(p.val, q.val)) {
            r = lowestCommonAncestor(root.left, p, q);
        }
        if (l==null && r== null) {
            return root;
        }
        if(l==null) {
            return r;
        } else {
            return l;
        }
    }
}
