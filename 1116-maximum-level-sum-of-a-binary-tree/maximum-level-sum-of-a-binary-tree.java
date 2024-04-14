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
    List<Integer> list = new ArrayList<>();
    public int maxLevelSum(TreeNode root) {
        traverse(root,0);
        int maxL = 0; int maxS = Integer.MIN_VALUE;
        for(int i =0;i<list.size();i++){
            if(maxS < list.get(i)){
                maxS = list.get(i);
                maxL = i + 1;
            }
        }
       return maxL; 
    }
    private void traverse(TreeNode root, int h){
        if(root == null)
            return;
        if(list.size()>h){
            int t=list.get(h)+ root.val;
            list.set(h,t);
        }else{
            list.add(h,root.val);
        }
        traverse(root.left, h+1);
        traverse(root.right, h+1);
    }
}