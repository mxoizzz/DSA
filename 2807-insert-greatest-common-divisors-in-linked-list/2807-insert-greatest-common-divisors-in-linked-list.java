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
        ListNode i=head;
        ListNode j=head.next;
        while (i.next!=null && j!=null){
            ListNode n=new ListNode(gcd(i.val,j.val));
            i.next=n;
            n.next=j;
            i=i.next.next;
            j=j.next;
        }
        return head;
    }
}