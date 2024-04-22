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
    public ListNode sortList(ListNode head) {
        ListNode node = head;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(node != null){
            pq.add(node.val);
            node = node.next;
        }
        node = head;
        while(node!=null){
            node.val = pq.poll();
            node = node.next;
        }
        return head;
    }
}