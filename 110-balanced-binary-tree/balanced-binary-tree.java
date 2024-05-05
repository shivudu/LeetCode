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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        traverse(root);
        return res;
    }
    public int traverse(TreeNode root){
        if(root == null)
            return 0;
        int left = traverse(root.left) + 1;
        int right = traverse(root.right) + 1;
        if(Math.abs(left-right) > 1){
            res = false;
        }
        return Math.max(left, right);
    }
}