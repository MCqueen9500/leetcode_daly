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
            ListNode slow = head;
            ListNode fast = head.next;

            while(fast!= null && fast.next!= null){
                fast = fast.next.next;
                slow = slow.next;
            }

            ListNode mid = slow.next;
            slow.next = null;

            ListNode current = mid;
            ListNode prev = null;
            ListNode next = null;
            while(mid != null){
                next = mid.next;
                mid.next = prev;
                prev = mid;
                mid = next;
            }

            ListNode h = head;
            ListNode hNext;
            ListNode pNext;
            while(prev != null && h != null){
                hNext = h.next;
                h.next = prev;
                pNext = prev.next;
                prev.next = hNext;
                h = hNext;
                prev = pNext;
            }
    }
}