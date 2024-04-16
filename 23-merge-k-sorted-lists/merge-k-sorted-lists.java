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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode n : lists){
            ListNode tmp = n;
            while(tmp!=null){
                q.add(new ListNode(tmp.val));
                tmp = tmp.next;
            }
        }
        res = q.poll();
        ListNode tmp = res;
        while(!q.isEmpty()){
            tmp.next = q.poll();
            tmp = tmp.next;
        }
        return res;
    }
}