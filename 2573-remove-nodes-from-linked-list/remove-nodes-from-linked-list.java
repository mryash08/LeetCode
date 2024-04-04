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
    public ListNode removeNodes(ListNode head) {
         ListNode temp = reverse(head);
         ListNode ans = temp;
         ListNode st = ans;
         temp = temp.next;
         while(temp != null){
             if(temp.val >= st.val){
                 st.next = temp;
                 st = st.next;
             }
             temp = temp.next;
         }
         st.next = null;
         return reverse(ans);
    }
    public ListNode reverse(ListNode head){
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