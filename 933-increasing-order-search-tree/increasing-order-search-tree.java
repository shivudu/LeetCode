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
    TreeNode node;
    TreeNode tmp;
    public TreeNode increasingBST(TreeNode root) {
        traverse(root);
        return node;
        
    }
    private void traverse(TreeNode root){
        if(root == null)
            return;
        traverse(root.left);
        if(node == null){
            node = new TreeNode(root.val);
            tmp = node;
        }
        else{

            tmp.right = new TreeNode(root.val);
            tmp = tmp.right;
        }
        traverse(root.right);
    }
}