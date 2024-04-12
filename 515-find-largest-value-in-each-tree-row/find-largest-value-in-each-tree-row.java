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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverse(root, 0, list);
        return list;
    }
    private void traverse(TreeNode root, int h,List<Integer> list){
        if(root == null)
            return;
        if(list.size() > h){
            if(list.get(h) < root.val){
                list.remove(h);
                list.add(h,root.val);
            }
        }else{
            list.add(h, root.val);   
        }
        traverse(root.left, h+1, list);
        traverse(root.right, h+1, list);
    }
}