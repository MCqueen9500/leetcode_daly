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
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode temp = head.next;
        ListNode dum = null;
        while(temp!=null){
            if(temp.val == prev.val){
                int vlaue = prev.val;
                while(temp != null && temp.val == vlaue){
                    temp = temp.next;
                }
                if(prev == head){
                    head = temp;
                }
                else{
                    dum.next = temp;
                    prev = temp;
                    if(temp != null){
                        temp = temp.next;
                    }
                    
                }
            }else{
                dum = prev;
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}