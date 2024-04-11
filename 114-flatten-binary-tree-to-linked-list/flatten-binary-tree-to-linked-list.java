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
    TreeNode tmp;
    TreeNode ll;
    public void flatten(TreeNode root) {
        traverse(root);
        TreeNode t = root;
        if(t!=null){
        t.left = null;
        t.right = ll.right;
        }
    }
    private void traverse(TreeNode root){
        if(root == null)
            return;
        if(tmp == null){
            ll = new TreeNode(root.val);
            tmp = ll;
        }
        else{
            tmp.right = new TreeNode(root.val);
            tmp = tmp.right;
        }
        flatten(root.left);
        flatten(root.right);
    }
}