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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        //Level order
        boolean comp = true;
        while(!qu.isEmpty()){
            TreeNode q = qu.poll();
            if(q == null){
                comp = false;
            } else{
                if(!comp) return comp;
                qu.add(q.left);
                qu.add(q.right);
            }
            
        }
        return true;
    }
}