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
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode tmp = head;
        while(tmp!=null){
            list.add(tmp);
            tmp = tmp.next;
        }
        int s = 0, e = list.size()-1;
        tmp = new ListNode(0);
        ListNode dummy = tmp;
        while(s<e){
            tmp.next = list.get(s++);
            tmp = tmp.next;
            tmp.next = list.get(e--);
            tmp = tmp.next;
            tmp.next = null;
        }
        if(s==e){
            tmp.next = list.get(s);
            tmp = tmp.next;
            tmp.next = null;
        }
        head = dummy.next;
    }
}