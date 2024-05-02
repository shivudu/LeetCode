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
    ListNode rev;
    ListNode revH;
    public ListNode reverseList(ListNode head) {
        reverse(head);
        return revH;
    }
    public void reverse(ListNode head){
        if(head == null)
            return;
        reverse(head.next);
        if(rev == null){
            revH = rev = head;
            }
        else{
            rev.next = head;
            rev = rev.next;
            rev.next = null;
        }
    }
}