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
    public int kthSmallest(TreeNode root, int k) {
        //in-order -> left, root, right
        List<Integer> ans = new ArrayList<>();
        helper(ans, root);
        return ans.get(k-1);
    }
    
    private void helper(List<Integer> ans, TreeNode root) {
        if (root == null) return;
        helper(ans, root.left);
        ans.add(root.val);
        helper(ans, root.right);
    }
}