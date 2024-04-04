/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }*/
 
class Solution {
    public ListNode doubleIt(ListNode head) {
        if(head.val > 4){
            head = new ListNode(0,head);
        }
        ListNode temp = head;
        while(temp!= null){
            temp.val = (temp.val*2)%10;
            if(temp.next != null && temp.next.val > 4){
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }
}
    // public ListNode doubleIt(ListNode head) {
    //      ListNode list = reverse(head);
    //      ListNode ans = new ListNode(100);
    //      ListNode temp = ans;
    //      int carry = 0;
    //      while(list != null){
    //         int sum = list.val * 2 + carry;
    //         carry = sum / 10;
    //         ListNode t = new ListNode(sum % 10);
    //         temp.next = t;
    //         temp = temp.next;
    //         list = list.next;
    //      }
    //      if(carry != 0){
    //            ListNode t = new ListNode(carry);
    //      temp.next = t;
    //      }
         
    //      return reverse(ans.next);
    // }
    // public ListNode reverse(ListNode head){
    //     ListNode curr = head;
    //     ListNode upcoming = null;
    //     ListNode prev = null;

    //     while(curr != null){
    //         upcoming = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = upcoming;
    //     }
    //     return prev;
    // }
