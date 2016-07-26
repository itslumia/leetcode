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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        int level = 0;
        helper(root, ans, level);
        return ans;
    }
    
    void helper(TreeNode root, List<List<Integer>> ans, int level) {
        if (root == null) return;
        if (level == ans.size()) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(root.val);
            ans.add(tmp);
        } else {
            ans.get(level).add(root.val);
        }
        helper(root.left, ans, level+1);
        helper(root.right, ans, level+1);
    }
}