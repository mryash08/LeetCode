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
    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = head;
        ListNode temp2 = head.next;
        ListNode temp3 = head.next;
        int i=0;
        while(temp.next != null && temp2.next != null){
                 if(i % 2 == 0){
                    temp.next = temp.next.next;
                    temp = temp.next; 
                 }else{
                     temp2.next = temp2.next.next;
                    temp2 = temp2.next; 
                 }
                 i++;
        }
        temp.next = temp3;
        temp2.next = null;

        return head;
    }
}