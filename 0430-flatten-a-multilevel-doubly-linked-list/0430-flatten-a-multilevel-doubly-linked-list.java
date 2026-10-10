/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node repair(Node head){
        if(head == null){
            return null;
        }
        Node current = head;
        Node next ;
        Node previous = current.prev;
        while(current != null){
            if(current.child != null){
                next = current.next;
                current.next = current.child;
                current.child.prev = current;
                Node ch = current.child;
                current.child = null;
                Node temp = repair(ch);
                if(next != null){
                    next.prev = temp;
                }
                temp.next = next;
                previous = temp;
                current = temp.next;
                continue;
            }
            previous = current;
            current = current.next;
        }
        return previous;
    }
    public Node flatten(Node head) {
        repair(head);
        return head;
    }
}