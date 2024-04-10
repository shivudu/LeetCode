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
class BSTIterator {
    int index = 0;
    List<TreeNode> list;
    TreeNode root;
    public BSTIterator(TreeNode root) {
        this.root = root;
        list = new ArrayList<TreeNode>();
        index = 0;
        inorder(root);
    }
    private void inorder(TreeNode node){
        if(node == null)
            return;
        inorder(node.left);
        list.add(node);
        inorder(node.right);
    }
    
    public int next() {
        return list.get(index++).val;
    }
    
    public boolean hasNext() {
        if(index < list.size())
            return true;
        else
            return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */