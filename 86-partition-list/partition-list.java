public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode prev = new ListNode(0);
        ListNode next = new ListNode(0);
        ListNode prevele = prev;
        ListNode nextele = next;
        
        while(head != null) {
            if(head.val < x) {
                prevele.next = head;
                prevele = prevele.next;
            } else {
                nextele.next = head;
                nextele = nextele.next;
            }
            head = head.next;
        }
        
        nextele.next = null;
        prevele.next = next.next;
        
        return prev.next;
    }
}