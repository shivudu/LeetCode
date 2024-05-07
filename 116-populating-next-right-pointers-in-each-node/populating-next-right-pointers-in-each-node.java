/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    List<Node> list = new ArrayList<>();
    public Node connect(Node root) {
        traverse(root,0);
        return root;
    }
    private void traverse(Node root,int h){
        if(root == null)
            return;
        if(list.size() > h){
            Node t = list.get(h);
            t.next = root;
            list.set(h,root);
        } else{
            list.add(h,root);
        }
        traverse(root.left, h+1);
        traverse(root.right, h+1);
    }
}