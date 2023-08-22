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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        

         ListNode temp1 = list1;
         ListNode temp2 = list2;

         ListNode temp3 = null;
         ListNode head = null;

         while(temp1 != null && temp2 != null){
             if(temp1.val > temp2.val){
                 if(temp3 == null){
                     ListNode node = new ListNode(temp2.val);
                    head = node;
                    temp3 = node;
                    temp2 = temp2.next;
                 }else{
                     ListNode node = new ListNode(temp2.val);
                     temp3.next = node;
                     temp3 = temp3.next;
                     temp2 = temp2.next;

                 }
                 
             }else{
                 if(temp3 == null){
                     ListNode node = new ListNode(temp1.val);
                    head = node;
                    temp3 = node;
                    temp1 = temp1.next;
                 }else{
                     ListNode node = new ListNode(temp1.val);
                     temp3.next = node;
                     temp3 = temp3.next;
                     temp1 = temp1.next;

                 }
             }
         }

         while(temp1 != null){
           
           if(temp3 == null){
                     ListNode node = new ListNode(temp1.val);
                    head = node;
                    temp3 = node;
                    temp1 = temp1.next;
                 }else{
                     ListNode node = new ListNode(temp1.val);
                     temp3.next = node;
                     temp3 = temp3.next;
                     temp1 = temp1.next;

                 }
              

                 
         }
         while(temp2 != null){
                
                      if(temp3 == null){
                     ListNode node = new ListNode(temp2.val);
                    head = node;
                    temp3 = node;
                    temp2 = temp2.next;
                 }else{
                     ListNode node = new ListNode(temp2.val);
                     temp3.next = node;
                     temp3 = temp3.next;
                     temp2 = temp2.next;

                 }

         }

         return head;
    }
}