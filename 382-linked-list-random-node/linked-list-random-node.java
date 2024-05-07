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
    int size;
    ListNode head;
    public Solution(ListNode head) {
        ListNode tmp = head;
        this.head = head;
        while(tmp!=null){
            size++;
            tmp = tmp.next;
        }
    }
    
    public int getRandom() {
        Random r = new Random();
        int i = r.nextInt(size);
        ListNode tmp = head;
        while(i-- > 0){
            tmp = tmp.next;
        }
        return tmp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */