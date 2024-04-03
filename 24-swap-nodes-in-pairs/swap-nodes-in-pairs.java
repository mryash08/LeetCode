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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ans = null;
        ListNode prev = null;
        ListNode currFirst = head;
        ListNode currSecond = null;
        ListNode upcoming = null;
        while(currFirst != null && currFirst.next != null){
            currSecond = currFirst.next;
            upcoming = currSecond.next;
            if(prev == null){
                ans = currSecond;
            }else{
                prev.next = currSecond;
            }
            prev = currFirst;
            currSecond.next = currFirst;
            currFirst.next = upcoming;
            currFirst = upcoming;
        } 
        return ans;
    }
}