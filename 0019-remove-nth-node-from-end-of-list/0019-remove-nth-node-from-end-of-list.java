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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        int jumps = 0;
        ListNode curr = head;
        while (jumps<n && curr != null) {
            curr = curr.next;
            jumps++;
        }

        if (curr == null) {
            return head.next;
        }
        
        ListNode newNode = head;
        
        while (curr.next!=null) {
            curr = curr.next;
            newNode = newNode.next;
        }

        newNode.next = newNode.next.next;
        
        return head;
    }
}
