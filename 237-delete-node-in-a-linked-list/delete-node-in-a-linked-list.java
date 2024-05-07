/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode tmp = node;
        ListNode prev = null;
        while(tmp!=null){
            if(tmp.next!=null){
                tmp.val = tmp.next.val;
            } else{
                prev.next = null;
                break;
            }
            prev = tmp;
            tmp = tmp.next;
        }
    }
}