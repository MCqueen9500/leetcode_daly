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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = l1;
        ListNode prev = null;
        ListNode next;
       
        ListNode ans = new ListNode();
        ListNode tail = ans;
        ListNode previous = null;
        int carry = 0;
        while(l1!=null && l2 != null){
            int sum = l1.val + l2.val + carry;
            l1 = l1.next;
            l2 = l2.next;
            carry = 0;
            if(sum > 9){
                tail.val = sum % 10;
                sum = sum/10;
                carry = sum % 10;
                ListNode newN = new ListNode();
                tail.next = newN;
                previous = tail;
                tail = newN;
                continue;
            }
            tail.val = sum;
            ListNode temp = new ListNode();
            tail.next = temp;
            previous = tail;
            tail = temp;
        }
        while(l1 != null){
            int sum = l1.val + carry;
            carry = 0;
            l1 = l1.next;
            if(sum > 9){
                tail.val = sum % 10;
                sum = sum/10;
                carry = sum % 10;
                ListNode newN = new ListNode();
                tail.next = newN;
                previous = tail;
                tail = newN;
                continue;
            }
            tail.val = sum;
            ListNode temp = new ListNode();
            tail.next = temp;
            previous = tail;
            tail = temp;
        }
        while(l2 != null){
            int sum = l2.val + carry;
            carry = 0;
            l2 = l2.next;
            if(sum > 9){
                tail.val = sum % 10;
                sum = sum/10;
                carry = sum % 10;
                ListNode newN = new ListNode();
                tail.next = newN;
                previous = tail;
                tail = newN;
                continue;
            }
            tail.val = sum;
            ListNode temp = new ListNode();
            tail.next = temp;
            previous = tail;
            tail = temp;
        }
        if(carry != 0){
            tail.val = carry;
            tail.next = null;
        }
        else{
            previous.next = null;
        }
    
        return ans;
    }
}