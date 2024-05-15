/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root,sb);
        return sb.toString();
    }
    private void traverse(TreeNode root,StringBuilder sb){
        if(root == null)
            sb.append("#").append(",");
        else{
            sb.append(root.val).append(",");
            traverse(root.left,sb);
            traverse(root.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return build(nodes);
    }
    private TreeNode build(Queue<String> nodes){
        String val = nodes.remove();
        if(val.equals("#"))
            return null;
        else{
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = build(nodes);
            node.right = build(nodes);
            return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));