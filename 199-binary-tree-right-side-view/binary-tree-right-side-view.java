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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverseR(root,list,0);
        return list;
    }
    private void traverseR(TreeNode root, List<Integer> list,int h){
       if(root == null)
            return;
        if(!(list.size() > h)){
            list.add(h,root.val);
        }else{
            list.remove(h);
            list.add(h,root.val);
        }
        traverseR(root.left,list,h+1);
        traverseR(root.right,list,h+1);
    }
}