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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode tmp = head;
        ListNode resH = null;
        ListNode t=null;
        while(tmp!=null && tmp.next!=null){
            ListNode s = tmp.next.next;
            if(resH == null){
                resH = tmp.next;
                t = tmp.next;
                t.next = tmp;
                t = t.next;
                t.next = null;
            } else{
                t.next = tmp.next;
                t.next.next = tmp;
                t = t.next.next;
                t.next = null;    
            }
            tmp = s;
        }
        if(tmp!=null)
            t.next = tmp;
        return resH;
    }
}