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
  
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode tmp = head;
        ListNode kPrev = null;
        ListNode kS = null;
        ListNode prev = null;
        while(tmp!=null){
            size++;
            if(size == k){
                kS = tmp;
                kPrev = prev;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        ListNode kEnd = null;
        ListNode kEndPrev = null;
        int kE = size - k;
        int i = 0;
        tmp = head;
        prev = null;
        while(tmp!=null){
            i++;
            if(i == kE+1){
                kEndPrev = prev;
                kEnd = tmp;
                break;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        int t = kS.val;
        kS.val = kEnd.val;
        kEnd.val = t;
        return head;
    }
    
}