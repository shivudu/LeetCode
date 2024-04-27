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
    public boolean isPalindrome(ListNode head) {
        StringBuilder nor = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        recur(head, nor, rev);
        return nor.toString().equals(rev.toString());
    }
    private void recur(ListNode head, StringBuilder nor, StringBuilder rev){
        if(head == null)    
            return;
        nor.append(head.val);
        recur(head.next,nor,rev);
        rev.append(head.val);
    }
}