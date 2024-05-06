/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int size = 0;
    ListNode ks=null, ke=null;
    public ListNode swapNodes(ListNode head, int k) {
        traverse(head,k,1);
        int t = ks.val;
        ks.val = ke.val;
        ke.val = t;
        return head;

    }
    private void traverse(ListNode head,int k,int index){
        if(head == null)
            return;
        size++;
        traverse(head.next,k,index+1);
        if(size - k + 1 == index){
            ke = head;
        }
        if(index == k){
            ks = head;
        }
    }
}