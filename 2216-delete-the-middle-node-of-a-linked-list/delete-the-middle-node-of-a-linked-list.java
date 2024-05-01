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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode tmp = head;
        int index = 0;
        int size = 0;
        //Iterate for size;
        while(tmp!=null){
            size++;
            tmp = tmp.next;
        }
        int midd = size/2;
        tmp = head;
        ListNode prev = head;
        while(true){
            if(index == midd){
                //found middle
                prev.next = tmp.next;
                break;
            }
            prev = tmp;
            tmp = tmp.next;
            index++;
        }
        return head;
    }
}