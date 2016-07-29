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
        if (root == p || root == q) return root;
        if (cover(root.left, p) && cover(root.right, q)) return root;
        if (cover(root.left, p) && cover(root.left, q)) return lowestCommonAncestor(root.left, p, q);
        if (cover(root.right, p) && cover(root.right, q)) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    
    private boolean cover(TreeNode root, TreeNode child) {
        if (root == null) return false;
        if (root == child) return true;
        return cover(root.left, child) || cover(root.right, child);
    }
}