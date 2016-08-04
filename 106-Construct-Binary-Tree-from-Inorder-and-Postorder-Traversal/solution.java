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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, postorder.length-1, 0, inorder.length-1);
    }
    
    private TreeNode helper(int[] in, int[] post, int index, int ins, int ine) {
        if (index < 0 || ins > ine) return null;
        TreeNode root = new TreeNode(post[index]);
        int key = 0;
        for (int i=ins; i<=ine; i++) if (in[i] == root.val) key=i;
        root.left = helper(in, post, index-1-ine+key, ins, key-1);
        root.right = helper(in, post, index-1, key+1, ine);
        return root;
    }
}