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
        if(lists.length == 0) return null;
        boolean flag = false;
        ListNode h = null;
        ListNode temp  = null;
        while(!flag){
             int max = 0;
             for(int i=1; i<lists.length; i++){
                  if(lists[max] == null) max = i;
                  else {
                    if(lists[i] != null && lists[i].val < lists[max].val){
                      max = i;
                  }
                  }
                  
             } 
             if(lists[max] == null) return h;
             if(h == null){
                 h = lists[max]; 
                 temp = h;
                 lists[max] = lists[max].next;
             }else{
                 temp.next = lists[max];
                 temp = temp.next;
                 lists[max] = lists[max].next;
             }
        }
        return h;
    }
}