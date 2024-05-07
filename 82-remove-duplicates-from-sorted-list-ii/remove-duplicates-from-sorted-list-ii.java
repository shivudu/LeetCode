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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        ListNode prev = null;
        boolean found = false;
        while(tmp!=null){
            if(tmp.next == null && found){
                if(prev!=null)
                    prev.next = null;
                else
                    head = null;
                break;
            } else if(tmp.next == null && !found){
                break;
            }
            if(tmp.val == tmp.next.val){
                found = true;
                tmp.next = tmp.next.next;
            } else if(found){
                if(prev != null)
                    prev.next = tmp.next;
                else
                    head = tmp.next;
                found = false;
                tmp = tmp.next;
            } else{
                prev = tmp;
                tmp = tmp.next;
            }
        }
        return head;
    }
}