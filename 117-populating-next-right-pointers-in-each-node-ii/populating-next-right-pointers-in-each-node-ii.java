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
    public Node connect(Node root) {
        List<Node> nodes = new ArrayList<Node>();
        traverse(root, nodes,0);
        return root;
    }
    private void traverse(Node root,List<Node> list, int h){
        if(root == null)
            return;
        if(!(list.size()>h)){
            list.add(h,root);
        }else{
          Node n = list.get(h);
          n.next = root;
          list.remove(h);
          list.add(h,root);  
        }
        traverse(root.left,list,h+1);
        traverse(root.right,list,h+1);
    }
}