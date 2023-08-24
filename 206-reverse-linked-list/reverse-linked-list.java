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
    // public ListNode reverseList(ListNode head) {
    //     if(head == null || head.next == null){
    //         return head;
    //     }

    //      ListNode res = reverseList(head.next);
    //      head.next.next = head;
    //      head.next = null;


    //      return res;
    // }

      public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode upcoming = null;

        while(curr != null){
             upcoming = curr.next;
             curr.next = prev;
             prev = curr;
             curr = upcoming;
        }


         return prev;
    }


      

}