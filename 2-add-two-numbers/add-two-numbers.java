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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode p1 = l1;
         ListNode p2 = l2;
         int carry = 0;
         ListNode head = new ListNode(100);
         ListNode curr = head;
         while(p1 != null || p2 != null || carry != 0){
             int temp = 0;
             if(p1 != null){
                  temp += p1.val;
                  p1 = p1.next;
             }
             if(p2 != null){
                 temp += p2.val;
                p2 = p2.next;
             }
              temp += carry;
              ListNode newnode = new ListNode(temp % 10);
              carry = temp/10;
              curr.next = newnode;                 
              curr = curr.next;
         }
        return head.next;
    }
}