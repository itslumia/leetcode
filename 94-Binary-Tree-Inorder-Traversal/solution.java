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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(ans, root);
        return ans;
    }
    
    private void helper(List<Integer> ans, TreeNode root) {
        if (root == null) return;
        helper(ans, root.left);
        ans.add(root.val);
        helper(ans, root.right);
    }
}