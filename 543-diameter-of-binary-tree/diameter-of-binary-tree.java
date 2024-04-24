/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return max-2;
    }
    private int traverse(TreeNode root){
        if(root == null)
            return 0;
        int left = traverse(root.left)+ 1;
        int right = traverse(root.right) + 1;
        max = Math.max(left + right, max);
        return Math.max(left,right);
    }
}