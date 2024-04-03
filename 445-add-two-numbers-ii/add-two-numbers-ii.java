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
          l1 = reverse(l1);
          l2 = reverse(l2);
         int carry = 0;
         ListNode temp = new ListNode(100);
         ListNode ans = temp;
         while(l1 != null && l2 != null){
            int sum = l1.val+l2.val+carry;
            carry = sum / 10;
            ListNode t1 = new ListNode(sum % 10);
            temp.next = t1;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
         }
         while(l1 != null){
            int sum = l1.val+carry;
            carry = sum / 10;
            ListNode t1 = new ListNode(sum % 10);
            temp.next = t1;
            temp = temp.next;
            l1 = l1.next;
         }
         while(l2 != null){
            int sum = l2.val+carry;
            carry = sum / 10;
            ListNode t1 = new ListNode(sum % 10);
            temp.next = t1;
            temp = temp.next;
            l2 = l2.next;
         }
         if(carry != 0){
            ListNode t1 = new ListNode(carry);
            temp.next = t1;
         }
         return reverse(ans.next);
    }
    public ListNode reverse(ListNode list){
        ListNode curr = list;
        ListNode prev = null;
        ListNode upcoming = null;
        while(curr != null){
            upcoming = curr.next;
            curr.next = prev;
            prev = curr;
            curr =upcoming;
        }
        return prev;
    }
}