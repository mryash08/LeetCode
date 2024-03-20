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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
         if(a == 0){
            ListNode a1 = tail(list2);
            while(b != 0){
                b--;
                list1 = list1.next;
            }
            a1.next = list1;
            return list2;
         }else{
            int c1 = b-a+2;
            ListNode a1 = list1;
            while(a  != 1){
                a--;
                a1 = a1.next;
            }
            ListNode b1 = a1;
            while(c1 != 0){
                c1--;
                b1 = b1.next;
            }
            ListNode c = tail(list2);
            a1.next = list2;
            if(c == null){
                a1.next = b1;
            }else{
                c.next = b1;
            }
            return list1;
         }
    }

     public ListNode tail(ListNode list2){
        ListNode temp = list2;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
     }
}