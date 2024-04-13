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
    public TreeNode convertBST(TreeNode root) {
        traverse(root,new AtomicInteger(0));
        return root;
    }
    private void traverse(TreeNode root,AtomicInteger t){
        if(root == null)
            return;
        traverse(root.right,t);
        root.val = t.get()+root.val;
        t.set(root.val);
        traverse(root.left,t);
    }
}