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
        // Base case
        if (root == null) {
            return null;
        }
        
        // If either p or q is the current node
        if (root == p || root == q) {
            return root;
        }
        
        // Recur for left and right subtrees
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);
        
        // If both left and right are non-null, then p and q are in different subtrees
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        
        // Otherwise, return the non-null child
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
}
