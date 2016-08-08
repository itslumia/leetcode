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
    public int countNodes(TreeNode root) {
        int left = getHeight(root);
        if (left < 0) return 0;
        int right = getHeight(root.right);
        if (right == left - 1) return (1<<left) + countNodes(root.right);
        else return (1<<(left-1)) + countNodes(root.left);
    }
    
    private int getHeight(TreeNode root) {
        return root == null ? -1 : 1 + getHeight(root.left);
    }
}