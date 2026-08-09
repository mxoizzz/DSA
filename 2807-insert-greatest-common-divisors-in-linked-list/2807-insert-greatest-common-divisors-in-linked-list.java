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
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return Math.abs(a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        while (curr.next!=null){
            ListNode n=new ListNode(gcd(curr.val,curr.next.val));
            n.next=curr.next;
            curr.next=n;
            curr=curr.next.next;
        }
        return head;
    }
}