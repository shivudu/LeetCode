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
    boolean id = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        traverse(root, subRoot);
        return id;
    }
    private void traverse(TreeNode root,TreeNode subRoot){
        if(root == null)
            return;
        boolean res = false;
        if(root.val == subRoot.val){
            res = checkIdentical(root, subRoot);
        }
        if(!res){
            traverse(root.left, subRoot);
            traverse(root.right, subRoot);
        } else{
            id = true;
        }
    }
    private boolean checkIdentical(TreeNode root, TreeNode sub){
        if(sub ==null && root == null)
            return true;
        if(sub == null || root == null)
            return false;
        if(sub == null)
            return true;
        if(root.val != sub.val)
            return false;
        boolean left = checkIdentical(root.left, sub.left);
        boolean right = checkIdentical(root.right, sub.right);
        return left && right;
    }
}