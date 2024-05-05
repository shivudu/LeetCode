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
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmp = head;
        ListNode prev = new ListNode(-1);
        ListNode dummy = prev;
        while(tmp!=null){
            if(tmp.val == val){
                prev.next = tmp.next;
            } else{
                prev.next = tmp;
                prev = prev.next;
            }
            tmp = tmp.next;
        }
        return dummy.next;
    }
}