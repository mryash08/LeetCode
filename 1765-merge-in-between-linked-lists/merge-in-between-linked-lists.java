/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = list1;
        ListNode second = list1;
        ListNode ans = first;
        int i = 1;
        int j = 0;
        while (i < a) {
            first = first.next;
            i++;
        }
        while (j < b) {
            second = second.next;
            j++;
        }
        first.next = list2;
        ListNode second2 = list2;
        while (second2.next != null) {
            second2 = second2.next;
        }
        second2.next = second.next;
        return ans;
    }
}