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
        if (root == null) return ans;
        String s = "";
        //s += root.val;
        helper(root, ans, s);
        return ans;
    }
    
    private void helper(TreeNode root, List<String> ans, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (s != "") s += "->";
            s += root.val;
            ans.add(s);
            return;
        } else {
            if (s != "") s += "->";
            s += root.val;
        }
        if (root.left != null) helper(root.left, ans, s);
        if (root.right != null) helper(root.right, ans, s);
        
    }
}