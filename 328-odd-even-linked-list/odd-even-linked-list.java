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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode tmp = head.next;
        ListNode prev = head;
        ListNode even = null;
        ListNode firstE = null;
        while(tmp!=null){
            prev.next = tmp.next;
            if(tmp.next !=null)
                prev = tmp.next;
            if(even == null){
                even = tmp;
                firstE = even;
                //System.out.println(even.val);
            } else{
                even.next = tmp;
                even = even.next;
                //System.out.println(even.val);
            }
            if(tmp.next !=null)
                tmp = tmp.next.next;
            else
                tmp = null;
        }
        even.next = null;
        prev.next = firstE;
        //System.out.println(prev.val);
        return head;
    }
}