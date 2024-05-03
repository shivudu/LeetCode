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
    public int pairSum(ListNode head) {
     ListNode slow = head, fast = head;
     ListNode slowPre = null;
     while(fast != null && fast.next != null){
        slowPre = slow;
        slow = slow.next;
        fast = fast.next.next;
     }
     int res = 0;
     ListNode pre = null;
     while(slow != null){
        ListNode t = slow.next;
        slow.next = pre;
        pre = slow;
        slow = t;
     }
     slow = head; fast = pre;
     while(slow!=null & fast!=null){
        res = Math.max(res, slow.val + fast.val);
        slow = slow.next;
        fast = fast.next;
     }
    return res;
    }
}