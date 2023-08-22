/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp = headA;
        int headASize = 0;
        while(temp != null){
             temp = temp.next;
              headASize++;
        }

        temp = headB;
        int headBSize = 0;
        while(temp != null){
             temp = temp.next;
              headBSize++;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        if(headASize > headBSize){
              for(int i=0; i<headASize - headBSize; i++){
                  tempA = tempA.next;
              }
        }else if (headASize < headBSize){
            for(int i=0; i<headBSize - headASize; i++){
                  tempB = tempB.next;
              }
        }

        while(tempA != null){
            if(tempA == tempB){
                return tempA;
            }
           tempA = tempA.next;
           tempB = tempB.next;

            
        }

        return null;
    }
}