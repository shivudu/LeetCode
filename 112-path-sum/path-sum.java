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
    boolean flag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        traverse(root,targetSum);
        return flag;
    }
    private void traverse(TreeNode root, int tS){
        if(root==null)
            return;
        tS = tS - root.val;
        traverse(root.left,tS);
        traverse(root.right,tS);
        if(tS==0 && root.left == null && root.right == null)
         flag = true;
    }
}