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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        int size = 0;
        ListNode tmp = head;
        ListNode tail = null;
        while(tmp!=null){
            size++;
            tail = tmp;
            tmp = tmp.next;
        }
        System.out.println("size"+size);
        k = k > size ? k % size : k;
        if(k == 0 || size == k)
            return head;
        int i = 0;
        int indx = size - k;
        tmp = head;
        ListNode newH=null;
        System.out.println(indx);
        while(tmp!=null){
            i++;
            if(i==indx){
                System.out.println(tmp.val);
                newH = tmp.next;
                tmp.next = null;
            }
            tmp = tmp.next;
        }
        tail.next = head;
        return newH;
        
    }
}