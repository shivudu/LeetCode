/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        Set<ListNode> set = new HashSet<>();
        ListNode res = null;
        ListNode tmp = head;
        while(tmp!=null){
            if(!set.add(tmp)){
                return tmp;
            }
            tmp=tmp.next;
        }
        return null;
    }
}