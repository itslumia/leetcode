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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, inorder.length-1);
    }
    
    private TreeNode helper(int[] pre, int[] in, int index, int ins, int ine) {
        if (index >= pre.length || ins > ine) return null;
        TreeNode root = new TreeNode(pre[index]);
        int key = 0;
        for (int i=ins; i<=ine; i++) {
            if (in[i] == root.val) key = i;
        }
        root.left = helper(pre, in, index+1, ins, key-1);
        root.right = helper(pre, in, index+1+key-ins, key+1, ine);
        return root;
    }
}