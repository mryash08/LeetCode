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
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        boolean flag = false;
        if(fast.next == null){
            flag = true;
        }
        ListNode te = slow.next;
        ListNode prev = null;
        ListNode curr = slow.next;
        ListNode up = null;
        while(curr != null){
            up = curr.next;
            curr.next = prev;
            prev = curr;
            curr = up;
        }
        slow.next = prev;
        ListNode head1 = head;
        while(prev != null){
            ListNode temp = prev.next;
            prev.next = head1.next;
            head1.next = prev;
            head1 = head1.next.next;
            prev = temp;
        }

        if(flag){
            slow.next = null;
        }else{
            te.next = null;
        }
    }
}