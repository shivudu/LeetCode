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
class CBTInserter {
    TreeNode root;
    List<TreeNode> list;
    int index;
    List<List<TreeNode>> tmp = new ArrayList<>();
    public CBTInserter(TreeNode root) {
        this.root = root;
        levelOrder(root, 0);
        list = new ArrayList<>();
        for(List<TreeNode> l: tmp){
            list.addAll(l);
        }
        index = list.size();
    }
    private void levelOrder(TreeNode root, int h){
        if(root == null)
            return;
        if(tmp.size() > h){
            tmp.get(h).add(root);
        } else{
            tmp.add(h, new ArrayList<>(Arrays.asList(root)));
        }
        levelOrder(root.left, h+1);
        levelOrder(root.right, h+1);
    }
    
    public int insert(int val) {
        int p = (index-1)/2;
        TreeNode parent = list.get(p);
        TreeNode curr = new TreeNode(val);
        if((index-2)/2 == p && index > 1){
            parent.right = curr;
        } else{
            parent.left = curr;
        }
        list.add(curr);
        index++;
        return parent.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */