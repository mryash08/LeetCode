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
    public ListNode mergeKLists(ListNode[] lists) {
        int[] freq = new int[20001];
        for(int i=0; i<lists.length; i++){
            ListNode head = lists[i];
            while(head != null){
                freq[10000+head.val]++;
                head = head.next;
            }
        }
        ListNode head = null;
        ListNode temp = null;
        int value = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] != 0){
                value = i-10000;
                for(int j=0; j<freq[i]; j++){
                     ListNode n = new ListNode(value);
                     if(head == null){
                         head = n;
                         temp = n;
                     }else{
                         temp.next = n;
                         temp = n;
                     }
                }
            }
        }
        return head;
    }
}