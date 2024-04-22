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
    public ListNode insertionSortList(ListNode head) {
        ListNode tmp = head.next;
        List<ListNode> arr = new ArrayList<>();
        arr.add(head);
        while(tmp!=null){
            int indx = arr.size() - 1;
            while(indx >= 0 && arr.get(indx).val > tmp.val){
                indx --;
            }
            arr.add(indx+1,tmp);
            tmp = tmp.next;
        }
        for(int i =0;i<arr.size();i++){
            if(i!=arr.size()-1)
                arr.get(i).next = arr.get(i+1);
            else
                arr.get(i).next = null;
            }
        return arr.get(0);
            
    }
}