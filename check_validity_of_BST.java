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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    
    private boolean isValidBST(TreeNode root, TreeNode lowNode, TreeNode highNode) {
        if (root == null) return true;
        if ((lowNode !=null && root.val <= lowNode.val)  || (highNode!= null && root.val >= highNode.val))
            return false;
        
        return isValidBST(root.left, lowNode, root) && isValidBST(root.right, root, highNode);
    }

}
