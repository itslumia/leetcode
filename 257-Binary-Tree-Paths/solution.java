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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root != null) helper(root, ans, "");
        return ans;
    }
    
    private void helper(TreeNode root, List<String> ans, String s) {
        if (root.left == null && root.right == null) ans.add(s + root.val);
        if (root.left != null) helper(root.left, ans, s + root.val + "->");
        if (root.right != null) helper(root.right, ans, s + root.val + "->");
        
    }
}