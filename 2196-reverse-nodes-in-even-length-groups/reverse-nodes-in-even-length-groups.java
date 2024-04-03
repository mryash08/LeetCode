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

    public ListNode reverseEvenLengthGroups(ListNode head) {
        int size = Size(head);
        int count = 1;
        int currSize = 0;
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            if (size - currSize < count) {
                count = size - currSize;
            }
            currSize += count;
            if (count % 2 == 1) {
                for (int i = 0; i < count-1 && temp != null; i++) {
                    temp = temp.next;
                }
                prev = temp;
                if(temp != null) temp = temp.next;
            } else {
                ListNode startS = temp;
                ListNode prev1 = null;
                ListNode curr = temp;
                ListNode upcoming = null;
                int c = count;
                while (c != 0 && curr != null) {
                    upcoming = curr.next;
                    curr.next = prev1;
                    prev1 = curr;
                    curr = upcoming;
                    c--;
                }
                startS.next = curr;
                prev.next = prev1;
                temp = curr;
                prev = startS;
            }
           count++;
        }
        return head;
    }

    public int Size(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

}