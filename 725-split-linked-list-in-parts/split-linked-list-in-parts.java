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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] splits = new ListNode[k];
        ListNode curr = head;
        int len = 0;

        while(curr != null) {
            len++;
            curr = curr.next;
        }

        curr = head;
        if(len <= k) {
            for(int i = 0; i < k; i++) {
                if(curr == null) break;
                if(curr != null) {
                    ListNode temp = new ListNode(curr.val);
                    splits[i] = temp;
                }
                curr = curr.next;
            }
        }else{
            // create a size array which will contain the size of each part //
            int[] size = new int[k];
            for(int i = 0; i < k; i++) {
                size[i] = len/k;
            }
            int ind = 0;
            if (len % k != 0) {
                int counter = len % k;
                while (counter != 0) {
                    size[ind]++;
                    counter--;
                    ind++;
                }
            }

            // we have the size array and can be solved in one pass //

            curr = head;
            for(int i = 0; i < k; i++) {
                ListNode temp = curr;
                for(int j = 1; j < size[i]; j++) {
                    curr = curr.next;
                }
                ListNode prev = curr;
                curr = curr.next;
                prev.next = null;
                splits[i] = temp;
            }
        }

        return splits;
    }
}