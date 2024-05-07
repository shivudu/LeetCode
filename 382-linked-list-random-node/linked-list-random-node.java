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
    ListNode head;
    List<Integer> list = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode tmp = head;
        this.head = head;
        while(tmp!=null){
            list.add(tmp.val);
            tmp = tmp.next;
        }
    }
    
    public int getRandom() {
        Random r = new Random();
        int i = r.nextInt(list.size());
        return list.get(i);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */