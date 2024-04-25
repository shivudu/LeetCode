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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        traverse(root1,list1);
        traverse(root2,list2);
        System.out.println(list1);
        System.out.println(list2);
        if(list1.size()!=list2.size())
            return false;
        for(int i=0;i<list1.size();i++){
            if(!list1.get(i).equals(list2.get(i)))
                return false;
        }
        return true;
    }
    private void traverse(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        traverse(root.left, list);
        traverse(root.right, list);
    }
}