/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (!cover(root, p) || !cover(root, q)) return null;
        return helper(root, p, q);
    }
    
    private TreeNode helper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        boolean p_left = cover(root.left, p);
        boolean q_left = cover(root.left, q);
        if (p_left != q_left) return root;
        TreeNode child = p_left ? root.left : root.right;
        return helper(child, p, q);
    }
    
    private boolean cover(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;
        return cover(root.left, p) || cover(root.right, p);
    }
}