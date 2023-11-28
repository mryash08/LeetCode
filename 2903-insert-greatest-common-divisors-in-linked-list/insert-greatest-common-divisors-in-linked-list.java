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
    public int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y,x%y);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
         ListNode p1 = head;
         ListNode p2 = head.next;
         while(p2 != null){
             ListNode n = new ListNode(gcd(p1.val,p2.val));
             n.next = p1.next;
             p1.next = n;
             p1 = p1.next.next;
             p2 = p2.next;
         }
         return head;
    }
}