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
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null || head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int n = k % size;
        if(n == 0) return head;
        temp = head;
        for(int i=0; i<size-n-1; i++){
           temp = temp.next;
        }
        ListNode ans = temp.next;
        temp.next = null;
        temp = ans;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return ans;
    }
}