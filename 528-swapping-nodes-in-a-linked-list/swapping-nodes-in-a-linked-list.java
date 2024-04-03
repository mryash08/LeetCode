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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode target1 = head;
        while(k != 1){
            target1 = target1.next;
            k--;
        }
        ListNode temp = target1.next;
        ListNode target2 = head;
        while(temp != null){
            temp = temp.next;
            target2 = target2.next;
        }
        int tem = target2.val;
        target2.val = target1.val;
        target1.val = tem;
        return head;
    }
}