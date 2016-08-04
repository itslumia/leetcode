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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, ans, 0);
        for (int i=0; i<ans.size(); i++) {
            if (i%2 == 1) Collections.reverse(ans.get(i));
        }
        return ans;
    }
    
    private void helper(TreeNode root, List<List<Integer>> ans, int level) {
        if (root != null) {
            List<Integer> list;
            if (ans.size() == level) {
                list = new ArrayList<>();
                ans.add(list);
            } else {
                list = ans.get(level);
            }
            list.add(root.val);
            helper(root.left, ans, level+1);
            helper(root.right, ans, level+1);
        }
    }
}