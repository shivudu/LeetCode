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
    int tot1 = 0;
    int tot2 = 0;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        traverse(root1,str1, true);
        traverse(root2,str2, false);
        System.out.println(str1);
        System.out.println(str2);
        return str1.toString().equals(str2.toString()) && tot1 == tot2;
    }
    private void traverse(TreeNode root, StringBuilder list, boolean first){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            list.append(root.val);
            if(first)
                tot1+=root.val;
            else
                tot2 += root.val;
            return;
        }
        traverse(root.left, list, first);
        traverse(root.right, list, first);
    }
}