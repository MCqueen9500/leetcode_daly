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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode temp1 = head;
        ListNode temp = temp1.next;
        while(temp != null){
            int val = temp1.val;
            if(temp.val == val){
                temp1.next = temp.next;
                temp = temp.next;
                continue;
            }
            temp = temp.next;
            temp1 = temp1.next;
        }
        return head;
    }
}