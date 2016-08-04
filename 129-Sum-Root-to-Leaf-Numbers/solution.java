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
    private int sum = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int path = 0;
        helper(root, path);
        return sum;
    }
    
    private void helper(TreeNode root, int path) {
        if (root.left == null && root.right == null) sum+=path*10+root.val;
        else {
            path = path*10 + root.val;
            if (root.left != null) helper(root.left, path);
            if (root.right != null) helper(root.right, path);
        }
    }
}