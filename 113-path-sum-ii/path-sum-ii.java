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
    List<List<Integer>> list;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        list = new ArrayList<List<Integer>>();
        traverse(root,targetSum,new ArrayList<Integer>());
        return list;
    }
    private void traverse(TreeNode root, int tS,List<Integer> paths){
        if(root == null)
            return;
        paths.add(root.val);
        tS = tS - root.val;
         if(root.left == null && root.right == null){
            if(tS == 0)
                list.add(new ArrayList(paths));
        }
        traverse(root.left,tS,paths);
        traverse(root.right,tS,paths);
        paths.remove(paths.size()-1);
    }
}