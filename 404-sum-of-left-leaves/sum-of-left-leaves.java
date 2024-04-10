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
    int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root,false);
        return sum;
    }
    private void traverse(TreeNode root, boolean left){
        if(root == null)
            return;
        if(root.left == null && root.right == null && left)
            sum = sum + root.val;
        traverse(root.left,true);
        traverse(root.right,false);
    }
}