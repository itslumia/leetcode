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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> ans = new ArrayList<>();
        if (n == 0) return ans;
        ans = helper(1, n);
        return ans;
    }
    
    private List<TreeNode> helper(int s, int e) {
        List<TreeNode> ans = new ArrayList<>();
        if (s > e) {
            ans.add(null);
            return ans;
        }
        if (s == e) {
            ans.add(new TreeNode(s));
            return ans;
        }
        List<TreeNode> left, right;
        for (int i=s; i<=e; i++) {
            left = helper(s, i-1);
            right = helper(i+1, e);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}