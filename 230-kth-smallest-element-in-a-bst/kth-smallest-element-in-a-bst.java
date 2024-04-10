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
    int t;
    int sV;
    public int kthSmallest(TreeNode root, int k) {
        t=k;
        traverse(root);
        return sV;
    }
    private void traverse(TreeNode node){
        if(node == null)
            return;
        traverse(node.left);
        if(t-- == 1){
            sV=node.val;
            return;
            }
        else{
        traverse(node.right);
        }
    }
}