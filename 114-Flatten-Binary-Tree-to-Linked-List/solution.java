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
    public void flatten(TreeNode root) {
        if (root == null) return;
        List<TreeNode> list = new ArrayList<>();
        helper(root, list);
        for (int i=0; i<list.size(); i++) {
            list.get(i).left = null;
            if (i != list.size()-1) list.get(i).right = list.get(i+1);
            else list.get(i).right = null;
        }
    }
    
    private void helper(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            list.add(root);
            helper(root.left, list);
            helper(root.right, list);
        }
    }
}