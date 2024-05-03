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
    public int pairSum(ListNode head) {
     ListNode tmp = head;
     List<Integer> list = new ArrayList<>();
     while(tmp!=null){
        list.add(tmp.val);
        tmp = tmp.next;
     }
     int s = 0, e = list.size()-1;
     int max = Integer.MIN_VALUE;
     while(s<e)
        max = Math.max(list.get(s++)+list.get(e--),max);
    return max;
    }
}