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

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        if (size == n) {
            return head.next;
        }

        int targetIdx = size - n; 
        curr = head;
        int i = 1;
        while (i < targetIdx) {
            curr = curr.next;
            i++; 
        }

        curr.next = curr.next.next;
        
        return head;
    }
}
