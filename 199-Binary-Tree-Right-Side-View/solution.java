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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        helper(root, ans, 0);
        return ans;
    }
    
    private void helper(TreeNode root, List<Integer> ans, int level) {
        if (root == null) return;
        if (level == ans.size()) ans.add(root.val);
        helper(root.right, ans, level+1);
        helper(root.left, ans, level+1);
    }
}