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
    public boolean isPalindrome(ListNode head) {
        
         ListNode slow = head;
         ListNode fast = head;

         while(fast.next != null && fast.next.next != null){
             fast = fast.next.next;
             slow = slow.next;
         }

         ListNode curr = slow.next;
         ListNode prev = null;
         ListNode upcoming = null;

         while(curr != null){
             upcoming = curr.next;
             curr.next = prev;
             prev = curr;
             curr = upcoming;
         }

         slow.next = prev;

         ListNode p1 = head;
         ListNode p2 = slow.next;

         while(p2 != null){
             if(p1.val != p2.val){
                 return false;
             }
             p1 = p1.next;
             p2 = p2.next;
         }

         return true;
    }
}