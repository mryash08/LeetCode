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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        ListNode ans = head;
        map.put(0,null);
        int sum = 0;
        while(temp != null){
            sum += temp.val;
            if(map.containsKey(sum)){
                if(map.get(sum) == null){
                ListNode te = ans;
                    while(te != temp){
                            set.add(te);
                            te = te.next;
                        }
                        ans = temp.next;
                }else{
                    if(!set.contains(map.get(sum))){
                        ListNode te = map.get(sum).next;
                        while(te != temp.next){
                            set.add(te);
                            te = te.next;
                        }
                        map.get(sum).next = temp.next;
                    }else{
                        map.put(sum,temp);
                    }
                }
            }else{
                map.put(sum,temp);
            }
            temp = temp.next;
        }
        return ans;
    }
}