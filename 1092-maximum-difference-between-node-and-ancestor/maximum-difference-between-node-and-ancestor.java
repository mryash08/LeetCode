/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        return maxAncestorHelper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public int maxAncestorHelper(TreeNode root,int max,int min){
        if(root == null){
            return max - min;
        }
        if(root.val > max) max = root.val;
        if(root.val < min) min = root.val;
        int a = maxAncestorHelper(root.left,max,min);
        int b = maxAncestorHelper(root.right,max,min);
        a = Math.max(max - min,a);
        return Math.max(b,a);
    }
}