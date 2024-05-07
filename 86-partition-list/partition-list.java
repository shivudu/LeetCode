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
    public ListNode partition(ListNode head, int x) {
       ListNode before = new ListNode(0);
       ListNode bD = before;
       ListNode after = new ListNode(0);
       ListNode aD = after;
       ListNode tmp = head;
       while(tmp!=null){
        if(tmp.val < x){
            before.next = tmp;
            tmp = tmp.next;
            before = before.next;
            before.next = null;
        } else{
            after.next = tmp;
            tmp = tmp.next;
            after = after.next;
            after.next = null;
        }
       }
       before.next = aD.next;
       return bD.next;
    }
}