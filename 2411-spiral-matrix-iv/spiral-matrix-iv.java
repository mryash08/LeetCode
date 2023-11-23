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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int size = 0; int trow = 0; int rcolumn = n-1; int brow = m-1; int lcolumn = 0;
        while(size <= m*n){
            int start = lcolumn; int end = rcolumn;
            while(start <= end){
                if(head == null){
                   ans[trow][start++] = -1;
                }else{
                   ans[trow][start++] = head.val;
                   head = head.next;
                }
                size++;
                if(size == m*n) return ans;
            }
            trow++;
            start = trow; end=brow;
            while(start <= end){
                if(head == null){
                    ans[start++][rcolumn] = -1;
                }else{
                   ans[start++][rcolumn] = head.val;
                   head = head.next;
                }
                size++;
                if(size == m*n) return ans;
            }
            rcolumn--;
             start = rcolumn; end=lcolumn;
            while(start >= end){
                if(head == null){
                    ans[brow][start--] = -1;
                }else{
                   ans[brow][start--] = head.val;
                   head = head.next;
                }
                size++;
                if(size == m*n) return ans;
            }
            brow--;
            start = brow; end=trow;
            while(start >= end){
                if(head == null){
                    ans[start--][lcolumn] = -1;
                }else{
                   ans[start--][lcolumn] = head.val;
                   head = head.next;
                }
                size++;
                if(size == m*n) return ans;
            }
            lcolumn++;
        }

        return ans;
    }
}