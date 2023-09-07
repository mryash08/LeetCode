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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head.next == null) return head;
        ListNode nodeLeft = head;
        ListNode nodeRight = head;
        int i = 2;
        for(; i<left; i++){
             nodeLeft = nodeLeft.next;
        }
        nodeRight = nodeLeft;
        for(; i<=right+1; i++){
             nodeRight = nodeRight.next;
        }
        
        
        ListNode curr = nodeLeft.next;
        if(left == 1){
           curr = head;
        }
        ListNode prev = null;
        ListNode upcoming = null;

       while(curr != null && curr != nodeRight){
           upcoming = curr.next;
           curr.next = prev;
           prev = curr;
           curr = upcoming;
       }
       
       if(left == 1) head = prev;
       else nodeLeft.next = prev;
       
       ListNode temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       temp.next = nodeRight;
     return head;
    }
}