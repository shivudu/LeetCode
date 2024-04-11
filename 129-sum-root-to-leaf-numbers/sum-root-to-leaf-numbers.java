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
    public int sumNumbers(TreeNode root) {
        List<String> list = new ArrayList<String>();
        rToL(root,list,"");
        int sum =0;
        for(String s: list){
            sum+=Integer.parseInt(s);
        }
        return sum;
    }
    private void rToL(TreeNode root,List<String> list, String tmp){
        if(root == null)
            return;
        tmp = tmp+root.val;
        rToL(root.left,list,tmp);
        rToL(root.right,list,tmp);
        if(root.left == null && root.right == null)
            list.add(tmp);       
    }
}