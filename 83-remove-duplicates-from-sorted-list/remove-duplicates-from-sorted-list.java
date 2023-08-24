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

        ListNode temp = head;
        ListNode temp2 = head;

        while(temp != null){
            temp = temp.next;
            if(temp != null && temp.val == temp2.val){
                 temp2.next = temp.next;
            }else if(temp != null){
                temp2 = temp2.next;
            }
        }
        
        return head;
    }
}