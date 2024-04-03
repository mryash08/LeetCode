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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode curr = head;
        ListNode pre = null;
        ListNode ans = null;
        while(curr != null){
            ListNode temp = curr;
             while(curr != null && curr.val == temp.val){
                 curr = curr.next;
             }
             
             if(temp.next == curr){
                if(pre == null){
                    pre = temp;
                    ans = temp;
                }else{
                    pre.next = temp;
                    pre = pre.next;
                }
             }
        }
        if(pre != null) pre.next = null;
        return ans;
    }
}