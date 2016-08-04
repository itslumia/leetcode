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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        helper(ans, new ArrayList<Integer>(), root, sum);
        return ans;
    }
    
    private void helper(List<List<Integer>> ans, List<Integer> path, TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                path.add(root.val);
                ans.add(new ArrayList<>(path));
                path.remove(path.size()-1);
                return;
            }
        } else {
            path.add(root.val);
            if (root.left != null) helper(ans, path, root.left, sum-root.val);
            if (root.right != null) helper(ans, path, root.right, sum-root.val);
            path.remove(path.size()-1);
        }
    }
}