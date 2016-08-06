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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        helper(root, ans);
        return ans;
    }
    
    private void helper(TreeNode root, List<Integer> ans) {
        if (root == null) return;
        helper(root.left, ans);
        helper(root.right, ans);
        ans.add(root.val);
    }
}