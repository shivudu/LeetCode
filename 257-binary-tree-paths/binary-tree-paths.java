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
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
      traverse(root, "");
      return res;
    }
    private void traverse(TreeNode root,String tmp){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            tmp += root.val;
            res.add(tmp);
        } else{
            tmp += root.val+"->";
        }
        
        traverse(root.left, tmp);
        traverse(root.right, tmp);
    }
}