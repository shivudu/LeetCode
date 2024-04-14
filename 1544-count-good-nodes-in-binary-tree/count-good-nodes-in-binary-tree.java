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
    int sum = 0; 
    public int goodNodes(TreeNode root) {
        traverse(root,root);
        return sum;
    }
    private void traverse(TreeNode root,TreeNode max){
        if(root == null)
            return;
        if(max.val < root.val)
            max = root;
       traverse(root.left,max);
        if(root.val >= max.val)
            sum++;
       traverse(root.right,max);
    }
}