/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        if(left!=null && (left!=p && left!=q))
            return left;
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(right!=null && (right!=p && right!=q))
            return right;
        if((left == p || left == q) && (right == p || right == q)){
            return root;
        }
        else if(left == p || left == q)
            return left;
        else if(right ==p || right == q)
            return right;
        else
            return null;
                    
    }
}