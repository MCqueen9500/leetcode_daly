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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start = null;
        ListNode priStart = null;
        ListNode end = null;
        ListNode temp = head;
        if(left == 1){
            start = head;
        }else{
            for(int i = 0;i<left - 2;i++){
            temp = temp.next;
        }
        priStart = temp;
        start = temp.next;
        temp = temp.next;
        }
        
        for(int i = 0;i<right - left ;i++){
            temp = temp.next;
        }
        end = temp.next;
        temp = start;
        ListNode prev = end;
        for(int i = 0;i<right - left ;i++){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

            temp.next = prev;
            if(priStart != null){
                priStart.next = temp;
                return head; 
            }
            return temp;
    }
}